package com.customer.customer_service.repository;

import com.customer.customer_service.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
