package com.example.storyshoptestthree.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;




@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private Integer id;
    private String product;
    private String brand;
    private String model;
    private String color;
    private String description;
    private List listProduct;

    @Override
    public String toString() {
        return "ProductDto\n{" +
                "\nid = " + id +
                ", \nproduct = '" + product + '\'' +
                ", \nbrand = '" + brand + '\'' +
                ", \nmodel = '" + model + '\'' +
                ", \ncolor = '" + color + '\'' +
                ", \ndescription = '" + description + "'\n}";
    }
}
