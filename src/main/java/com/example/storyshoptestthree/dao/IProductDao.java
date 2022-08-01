package com.example.storyshoptestthree.dao;

import com.example.storyshoptestthree.entity.product.ProductEntity;

import java.util.List;

public interface IProductDao {

    List<ProductEntity> getAllProduct();

    ProductEntity getByIdProduct(int id);

    void updateProduct(ProductEntity productEntity);

    void deleteProduct(int id);

}
