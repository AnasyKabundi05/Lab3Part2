package com.example.lab3part2.repository;

import com.example.lab3part2.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository <Category, Long> {

}
