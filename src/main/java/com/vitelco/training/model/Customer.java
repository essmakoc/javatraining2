package com.vitelco.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long id;
    private String firstName;
    private String lastName;

    //Constructor
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String placeOrder(){
        return "Musteri: " + this.toString() + " bir siparis olusturdu.";
    }


}
