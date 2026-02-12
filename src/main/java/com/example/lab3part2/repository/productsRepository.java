package com.example.lab3part2.repository;

import com.example.lab3part2.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productsRepository extends JpaRepository<Products, Long> {

}
