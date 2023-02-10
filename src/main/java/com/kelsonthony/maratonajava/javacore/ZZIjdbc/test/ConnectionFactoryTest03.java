package com.kelsonthony.maratonajava.javacore.ZZIjdbc.test;

import com.kelsonthony.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import com.kelsonthony.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest03 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("Hyoga").build();
        Producer producer2 = Producer.builder().name("Saori").build();
        Producer producer3 = Producer.builder().name("Athena").build();

        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
        log.info("Saving Transaction Test");

    }
}
