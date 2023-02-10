package com.kelsonthony.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethodObjectIsOfChildType() {
        Employee employeeDeveloper = new Developer("1", "Java");
        Employee employeeDeveloper1 = new Employee("1");

        if (employeeDeveloper instanceof Developer) {
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }

        if (employeeDeveloper instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}