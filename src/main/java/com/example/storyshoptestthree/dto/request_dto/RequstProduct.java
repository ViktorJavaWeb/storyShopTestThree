package com.example.storyshoptestthree.dto.request_dto;

import com.example.storyshoptestthree.dto.ProductDto;
import com.example.storyshoptestthree.entity.product.ProductEntity;

public class RequstProduct {

    private ProductDto productDto;

    public RequstProduct(ProductDto productDto) {
        this.productDto = productDto;
    }




    private ProductDto convertEntityToDto(ProductEntity productEntity) {
        ProductDto productDto = new ProductDto();
        productDto.setId(productEntity.getId());
        productDto.setProduct(productEntity.getNameProduct());
        productDto.setBrand(productEntity.getBrand().getNameBrand());
        productDto.setModel(productEntity.getModel().getNameModel());
        productDto.setColor(productEntity.getColor().getNameColor());
        productDto.setDescription(productEntity.getDescription().getNameDiscription());
        return productDto;
    }
}
