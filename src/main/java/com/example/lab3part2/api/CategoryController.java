package com.example.lab3part2.api;

import com.example.lab3part2.domain.Category;
import com.example.lab3part2.service.categoryService;
import org.springframework.web.bind.annotation.*;


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
    public Category getCategoryById(@PathVariable Long id){
      return   categoryService.getCategoryById(id);
    }


    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return   categoryService.createCategory(category);
    }
}
