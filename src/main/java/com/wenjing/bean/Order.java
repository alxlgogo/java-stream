package com.wenjing.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {
    @Id
    private Long id;

    private Date orderDate;
    private Date deliveryDate;
    private String status;

    @ManyToOne
    private Customer customer;


    @ManyToMany
    @JoinTable(name = "order_product",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    Set<Product> products;
}
