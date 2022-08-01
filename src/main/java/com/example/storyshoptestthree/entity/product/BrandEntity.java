package com.example.storyshoptestthree.entity.product;


import com.example.storyshoptestthree.entity.product.ProductEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "brand")
@NoArgsConstructor
@AllArgsConstructor
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer id;

    @Column(name = "brand_name")
    private String nameBrand;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},
            mappedBy = "brand", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProductEntity> listBrand;

    public BrandEntity(String nameBrand) {
        this.nameBrand = nameBrand;
    }
}
