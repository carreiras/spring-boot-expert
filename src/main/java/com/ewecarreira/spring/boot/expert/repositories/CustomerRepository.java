package com.ewecarreira.spring.boot.expert.repositories;


import com.ewecarreira.spring.boot.expert.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
