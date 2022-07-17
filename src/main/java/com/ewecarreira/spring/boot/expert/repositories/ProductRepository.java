package com.ewecarreira.spring.boot.expert.repositories;


import com.ewecarreira.spring.boot.expert.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
