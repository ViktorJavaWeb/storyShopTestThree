package com.example.storyshoptestthree.service;

import com.example.storyshoptestthree.dao.IProductDao;
import com.example.storyshoptestthree.dao.ProductDaoImpl;
import com.example.storyshoptestthree.dto.ProductDto;
import com.example.storyshoptestthree.entity.product.*;
import com.example.storyshoptestthree.other.ColorFont;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



@Service
public class ProductServiceImpl implements IProductService {



    @Autowired
    private IProductDao iProductDao;

    @Override
    @Transactional
    public List<ProductDto> getAllProduct() {

        return iProductDao.getAllProduct()
                .stream()
                .map(this::convertEntityToDto)
                .toList(); //collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ProductDto getByid(int id) {
        return convertEntityToDto(iProductDao.getByIdProduct(id));
    }

    @Override
    @Transactional
    public ProductEntity updateProduct(ProductDto productDto) {

        ProductEntity productEntity = convertDtoToEntity(productDto);

        return productEntity;
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
        ProductDto product = getByid(id);
        iProductDao.deleteProduct(id);
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

    private ProductEntity convertDtoToEntity(ProductDto productDto) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(productDto.getId());
        productEntity.setNameProduct(productDto.getProduct());
        productEntity.setBrand(new BrandEntity(productDto.getBrand()));
        productEntity.setModel(new ModelEntity(productDto.getModel()));
        productEntity.setColor(new ColorEntity(productDto.getColor()));
        productEntity.setDescription(new DescriptionEntity(productDto.getDescription()));
        return productEntity;
    }
}
