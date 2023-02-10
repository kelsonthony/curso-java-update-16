package com.kelsonthony.maratonajava.javacore.ZZKjunit.test;

import com.kelsonthony.maratonajava.javacore.ZZKjunit.dominio.Person;
import com.kelsonthony.maratonajava.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);

        PersonService personService = new PersonService();
        personService.isAdult(person);
        log.info("Is Adult? '{}'", personService.isAdult(person));
    }
}
