package com.tutorial.apidemo.Springboot.toturial.model;

public class Product {
    private Long id;
    private String ProductName;
    private int year;
    private Double price;
    private String url;

    // Primary Contructor
    public Product(){

    }

    // Second Contructor
    public Product(Long id, String productName, int year, Double price, String url) {
        this.id = id;
        ProductName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }
}
