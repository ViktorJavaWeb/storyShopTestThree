package com.example.storyshoptestthree.dao;



import com.example.storyshoptestthree.entity.product.ProductEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class ProductDaoImpl implements IProductDao {

    @Autowired
    public EntityManager entityManager;

    @Override
    public List<ProductEntity> getAllProduct() {

        List<ProductEntity> allProducts =null;
        try {
            Query query = entityManager.createQuery("FROM ProductEntity");
            allProducts = query.getResultList();
        }catch (Exception e){

        }

        return allProducts;
    }

    @Override
    public ProductEntity getByIdProduct(int id) {
        ProductEntity productEntity = entityManager.find(ProductEntity.class, id);
        return productEntity;
    }

    @Override
    public void updateProduct(ProductEntity productEntity) {
        ProductEntity newProduct = entityManager.merge(productEntity);
        productEntity.setId(newProduct.getId());
    }

    @Override
    public void deleteProduct(int id) {
        Query query = entityManager.createQuery("DELETE FROM ProductEntity WHERE product_id =:idProduct");
        query.setParameter("idProduct", id);
        query.executeUpdate();
    }
}
