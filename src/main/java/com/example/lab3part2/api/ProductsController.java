package com.example.lab3part2.api;

import com.example.lab3part2.domain.Category;
import com.example.lab3part2.domain.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.lab3part2.service.productsService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final productsService productsService;

    public ProductsController(productsService productsService){
        this.productsService = productsService;
    }

    @GetMapping
    public List<Products> getAllProducts(){
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products createProducts(@PathVariable Long id){
       return productsService.createProducts(id);
    }
}
