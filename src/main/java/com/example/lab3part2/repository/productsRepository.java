package com.example.lab3part2.repository;

import com.example.lab3part2.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productsRepository extends JpaRepository<Products, Long> {

    List<Products> id(Long id);
}
