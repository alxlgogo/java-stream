package com.wenjing;

import com.wenjing.bean.Customer;
import com.wenjing.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomerTest {

    @Autowired(required = false)
    private CustomerRepository customerRepository;

    @Test
    public void testGetUser() {
        Iterable<Customer> customers = customerRepository.findAll();
        System.out.println(customers);
    }
}
