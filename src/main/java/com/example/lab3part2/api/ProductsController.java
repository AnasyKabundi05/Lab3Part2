package com.example.lab3part2.api;

import com.example.lab3part2.domain.Category;
import com.example.lab3part2.domain.Products;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/{id}")
    public Products createProduct(@PathVariable Long id, @RequestBody Products product){
       return productsService.createProduct(id, product);
    }

    @PostMapping
    public Products addProduct(@RequestBody Products product){
        return productsService.addProduct(product);
    }
}
