package com.vitelco.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

/*
1. getter and setters
2. constructors
3. equal and hashcode
4. toString
5. Serializable
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Order {

    //property, state, field = class member
    private long id;
    private LocalDateTime dateTime;
    private float amount;
    private float vat;
    private Customer customer;

    private Set<OrderItem> items;

    public Order(long id, Customer customer, Set<OrderItem> items) {
        this.id = id;
        this.dateTime = LocalDateTime.now();
        this.customer = customer;
        this.items = items;

        this.amount = this.calcTotalPrice();
        this.vat =this.calcTotalVat();
    }


    public float calcTotalPrice(){
        if (this.getItems().size() == 0){
            log.warn("There is no order item");
            return 0f;
        }

        float total = 0f;
        for (OrderItem item: this.getItems()) {
            total += item.getPrice() * item.getQty();
        }
        return total;
    }
    public float calcTotalVat(){
        if (this.getItems().size() == 0){
            log.warn("There is no order item");
            return 0f;
        }

        float totalVat = 0f;
        for (OrderItem item: this.getItems()) {
            totalVat += item.getPrice() * 0.18;
        }
        return totalVat;
    }

}
