package com.vitelco.training.model;

import lombok.Data;

@Data
public class OrderItem {

    private long id;
    private Order order;
    private String title;
    private int qty;
    private int price;

    public OrderItem(long id, String title, int qty, int price) {
        this.id = id;
        this.title = title;
        this.qty = qty;
        this.price = price;
    }
}
