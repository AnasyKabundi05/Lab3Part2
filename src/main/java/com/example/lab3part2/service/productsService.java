package com.example.lab3part2.service;

import com.example.lab3part2.domain.Products;
import com.example.lab3part2.repository.productsRepository;
import com.example.lab3part2.repository.categoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productsService {

    private final productsRepository productsRepository;
    private final categoryRepository categoryRepository;


    public productsService(productsRepository productsRepository, categoryRepository categoryRepository) {
        this.productsRepository = productsRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }

    public Products createProducts(Long id){
        return productsRepository.save(id);
    }




}
