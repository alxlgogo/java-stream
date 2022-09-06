package com.wenjing.repository;

import com.wenjing.bean.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
