package com.vitelco.training.model;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {


    // Assert
    @Test
    @DisplayName("Merhaba Esma Testi")
    public void shouldReturnHelloEsma(){
        Person person = new Person("Esma");
        Assertions.assertEquals("Hello Esma",person.sayHello());
    }

    @Test
    @DisplayName("shouldReturnEight")
    public void shouldReturnEight(){
        Person person = new Person();
        Assertions.assertEquals(8f, person.timesTwo(4f));
    }

    @Test
    @DisplayName("divideTest")
    public void divideTest(){
        Person person = new Person();
        Assertions.assertEquals(50f, person.divide(2f));
    }
}
