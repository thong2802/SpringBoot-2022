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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String  toString() {
        return "Product{" +
                "id=" + id +
                ", ProductName='" + ProductName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
