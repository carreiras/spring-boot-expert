package com.ewecarreira.spring.boot.expert.repositories;


import com.ewecarreira.spring.boot.expert.entities.Product;
import com.ewecarreira.spring.boot.expert.entities.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
