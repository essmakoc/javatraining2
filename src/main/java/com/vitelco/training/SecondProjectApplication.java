package com.vitelco.training;

import com.vitelco.training.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SecondProjectApplication.class, args);

        Customer customer = new Customer(1,"Esma", "Koc");

        OrderItem itm1 = new OrderItem(1, "iphone", 1, 15000);
        OrderItem itm2 = new OrderItem(2, "keyboard", 2, 100);

        Set<OrderItem> items = new HashSet();
        items.add(itm1);
        items.add(itm2);

        Order order = new Order(1, customer, items);
        order.setItems(items);

        log.info("musteri: {} - siparis: {}", customer, order);


    }





}
