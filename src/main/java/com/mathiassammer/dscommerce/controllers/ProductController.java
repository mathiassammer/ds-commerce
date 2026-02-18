package com.mathiassammer.dscommerce.controllers;

import com.mathiassammer.dscommerce.dto.ProductDTO;
import com.mathiassammer.dscommerce.entities.Product;
import com.mathiassammer.dscommerce.repositories.ProductRepository;
import com.mathiassammer.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return productService.findById(id);
    }
}
