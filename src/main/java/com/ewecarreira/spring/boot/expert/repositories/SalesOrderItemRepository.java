package com.ewecarreira.spring.boot.expert.repositories;


import com.ewecarreira.spring.boot.expert.entities.SalesOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderItemRepository extends JpaRepository<SalesOrderItem, Long> {
}
