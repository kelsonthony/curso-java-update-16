package com.kelsonthony.maratonajava.javacore.ZZIjdbc.test;

import com.kelsonthony.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
//        log.info("-----------------------------------------------");
//        Producer producerUpdate = Producer.builder().id(1).name("Kakaroto").build();
//        ProducerServiceRowSet.updateJdbcRowSet(producerUpdate);
//        log.info(producerUpdate);
        Producer producerUpdate = Producer.builder().id(1).name("Son Goku").build();
        ProducerServiceRowSet.updateCachedRowSet(producerUpdate);
        log.info(producerUpdate);


    }
}
