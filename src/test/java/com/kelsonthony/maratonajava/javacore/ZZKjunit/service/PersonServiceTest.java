package com.kelsonthony.maratonajava.javacore.ZZKjunit.service;

import com.kelsonthony.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private Person adult;
    private Person notAdult;
    private PersonService personService;
    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();

    }
    @Test
    @DisplayName("A person should be not adult age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreatOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPOinterException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null));
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenLisOfPersonWithAdultIsPassed() {
        Person person = new Person(17);
        Person person2 = new Person(18);
        Person person3= new Person(21);
        List<Person> personList = List.of(person, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());

    }
}