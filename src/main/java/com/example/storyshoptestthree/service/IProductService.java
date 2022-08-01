package com.example.storyshoptestthree.service;


import com.example.storyshoptestthree.dto.ProductDto;
import com.example.storyshoptestthree.entity.product.ProductEntity;

import java.util.List;


public interface IProductService {

    List<ProductDto> getAllProduct();

    ProductDto getByid(int id);

    ProductEntity updateProduct(ProductDto product);


    void deleteProduct(int id);
}
