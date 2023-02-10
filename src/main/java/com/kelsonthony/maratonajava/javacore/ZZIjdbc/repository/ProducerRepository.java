package com.kelsonthony.maratonajava.javacore.ZZIjdbc.repository;

import com.kelsonthony.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');"
                .formatted(producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the databse, row affect '{}'", producer.getName(), rowsAffected);
            //System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while tring to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            log.error("Error while tring to save transaction producer '{}'", producers, e);
            //e.printStackTrace();
        }
    }

    private static void preparedStatementSaveTransaction(Connection connection,List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ( ? );";
        boolean shouldRollback = false;
        for (Producer producer : producers) {
             try (PreparedStatement ps = connection.prepareStatement(sql);) {
                 log.info("Saving transaction producer '{}'", producer.getName());
                 ps.setString(1, producer.getName());
                 //if (producer.getName().equals("Athena")) throw new SQLException("Can't save Athena");
                 ps.execute();
             } catch (SQLException e) {
                 e.printStackTrace();
                 shouldRollback = true;
             }
        }
        if (shouldRollback) {
            log.warn("Transaction is going be rollback");
            connection.rollback();
        }


    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');"
                .formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in the databse, row affect '{}'", id, rowsAffected);
            //System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while tring to delete producer '{}'", id, e);
            //e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' in the databse, row affect '{}'", producer.getId(), rowsAffected);
            //System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while tring to update producer '{}'", producer.getId(), e);
            //e.printStackTrace();
        }
    }

    public static void updatePreparedStatement(Producer producer) {


        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer '{}' in the databse, row affect '{}'", producer.getId(), rowsAffected);
            //System.out.println(rowsAffected);
        } catch (SQLException e) {
            log.error("Error while tring to update producer '{}'", producer.getId(), e);
            //e.printStackTrace();
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2,  producer.getId());

        return ps;

    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Producer producer = Producer.builder().id(id).name(name).build();
//                producers.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producer", e);
//
//        }
//        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding by Name");
        //String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%" +name +"%");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding by Name");
        //String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%" +name +"%");
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));

        return ps;

    }

    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding by Name");
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    private static CallableStatement callableStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement cs = connection.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));

        return cs;

    }

    public static void showProducerMetaData() {
        log.info("Showing Producers Metadata");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }

    }

    public static void showDriverMetaData() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("AND Supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("AND Supports CONCUR_UPDATABLE");
                }
            }

            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("AND Supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }

    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer order by name desc";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Last row? '{}'", rs.last());
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row? '{}'", rs.first());
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row  Absolute? '{}'", rs.absolute(2));
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Relative? '{}'", rs.relative(-1));
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("IS LAST? '{}'", rs.isLast());
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("IS FIRST? '{}'", rs.isFirst());
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("IS After Last? '{}'", rs.isAfterLast());
            log.info("Row number  '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("-------------------------------");
            rs.next();
            log.info("IS After Last? '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }

    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding by findByNameAndUpdateToUpperCase");
        //String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%" +name +"%");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                //rs.cancelRowUpdates(); // para voltar ao estado anterior
                rs.updateRow();
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding by findByNameAndUpdateToUpperCase");
        //String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%" +name +"%");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding by findByNameAndUpdateToUpperCase");
        //String sql = "SELECT * FROM anime_store.producer where name like '%s';".formatted("%" +name +"%");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}' ", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);

        }

    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }



}
