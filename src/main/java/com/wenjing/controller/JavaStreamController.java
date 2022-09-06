package com.wenjing.controller;

import com.wenjing.bean.Customer;
import com.wenjing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class JavaStreamController {

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping("/customers")
    public ArrayList<Customer> customers() {
        ArrayList<Customer> customers = (ArrayList<Customer>) customerRepository.findAll();
        List<Customer> newCustomers = customers.stream().filter(p -> p.getTier() > 2).collect(Collectors.toList());
        return customers;
    }
}
