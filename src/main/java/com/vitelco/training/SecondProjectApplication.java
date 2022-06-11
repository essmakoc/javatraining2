package com.vitelco.training;

import com.vitelco.training.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SecondProjectApplication.class, args);

        Sample sample = new Sample("abc","90564695656"); //Class -> Object: is an instance of a class
        // sample.setX("abc"); //value assign
        //sample.setTel("+90564695656");

        System.out.println(sample);

/*
        Customer customer = new Customer();
        customer.setFirstName("Esma");
        customer.setLastName("Koc");
        customer.setId(10001);
*/
        Customer customer = new Customer(1001, "Esma", "Koc");
        System.out.println(customer.placeOrder());

    }





}
