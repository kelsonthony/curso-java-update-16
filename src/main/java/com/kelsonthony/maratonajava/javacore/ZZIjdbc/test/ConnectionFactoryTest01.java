package com.kelsonthony.maratonajava.javacore.ZZIjdbc.test;

import com.kelsonthony.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        //ConnectionFactory.getConnection().close();
        Producer producer = Producer.builder().name("Deen").build();
        Producer producer2 = Producer.builder().id(1).name("Aioria").build();

        //ProducerService.save(producer);

        //ProducerService.delete(6);
        //ProducerService.update(producer2);
        //ProducerService.updatePreparedStatement(producer2);

//        List<Producer> producers = ProducerService.findAll();
//        log.info("Producers: '{}'", producers);
        //List<Producer> producers = ProducerService.findbyName("Kakaroto");
        //log.info("Producers by Name: '{}'", producers);
        //ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        log.info("Producers by findByNameAndUpdateToUpperCase: '{}'", producers);
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Vegeta");
//        log.info("Producers by findByNameAndInsertWhenNotFound: '{}'", producers);
        //ProducerService.findByNameAndDelete("Vegeta");
        //List<Producer> producers = ProducerService.findByNamePreparedStatement("B or X'='X");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("KA");
//        log.info("Producers by findByNamePreparedStatement: '{}'", producers);
        List<Producer> producers = ProducerService.findByNameCallableStatement("NH");
        log.info("Producers by findByNameCallableStatement: '{}'", producers);

//        log.info("INFO");
//        log.debug("debug");
//        log.warn("warn");
//        log.error("error");
//        log.trace("trace");
    }
}
