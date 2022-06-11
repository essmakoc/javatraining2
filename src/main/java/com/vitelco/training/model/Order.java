package com.vitelco.training.model;

import java.time.LocalDateTime;
import java.util.Objects;

/*
1. getter and setters
2. constructors
3. equal and hashcode
4. toString
5. Serializable
*/

public class Order {
    //property, state, field = class member
    private long id;
    private LocalDateTime dateTime;
    private float amount;
    private float vat;
    private Customer customer;

    //Constructor
    public Order(long id, LocalDateTime dateTime, float amount, float vat, Customer customer) {
        this.id = id;
        this.dateTime = dateTime;
        this.amount = amount;
        this.vat = vat;
        this.customer = customer;
    }
    //Constructor
    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Float.compare(order.amount, amount) == 0 && Float.compare(order.vat, vat) == 0 && Objects.equals(dateTime, order.dateTime) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateTime, amount, vat, customer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}
