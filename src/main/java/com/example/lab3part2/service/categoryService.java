package com.example.lab3part2.service;
import com.example.lab3part2.api.CategoryController;
import com.example.lab3part2.repository.productsRepository;
import com.example.lab3part2.domain.Category;
import com.example.lab3part2.repository.categoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryService {

    private final categoryRepository categoryRepository;
    private final productsRepository productsReposiotry;

    public categoryService(categoryRepository categoryRepository, productsRepository productsReposiotry) {
        this.categoryRepository = categoryRepository;
        this.productsReposiotry = productsReposiotry;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category createCategory(Long id){
        return createCategory(id);
    }


}


