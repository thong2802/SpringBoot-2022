package com.tutorial.apidemo.Springboot.toturial.controllers;

import com.tutorial.apidemo.Springboot.toturial.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProducController {
    @GetMapping("")
    // thi request is : http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        return List.of(
                new Product(2349L, "Macbook", 2001, 10.000, "https://viblo.asia/p/lo-trinh-tu-hoc-spring-framework-tu-co-ban-den-nang-cao-924lJmbzZPM"),
                new Product(249L, "Macbook 2022", 301, 50.000, "https://viblo.asia/p/lo-trinh-tu-hoc-spring-framework-tu-co-ban-den-nang-cao-924lJmbzZPM")
                );
        // You must have to save database, now we have H2 DB = In-memory Database
        // you can also send request using postman
    }
}
