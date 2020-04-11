package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/hi")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
       return productService.getAllProducts();
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }


}
