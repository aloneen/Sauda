package kz.seisen.sauda.models;


import lombok.Data;

@Data
public class Product {
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;


}
