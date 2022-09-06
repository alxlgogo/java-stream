package com.wenjing.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Product {

    @Id
    private Long id;

    private String name;
    private String category;
    private Double price;

    @ManyToMany(mappedBy = "products")
    private Set<Order> orders;


}
