package com.example.lab3part2.api;

import com.example.lab3part2.domain.Category;
import com.example.lab3part2.service.categoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final categoryService categoryService;

    public CategoryController(categoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category createCategory(@PathVariable Long id){
      return   categoryService.createCategory(id);
    }
}
