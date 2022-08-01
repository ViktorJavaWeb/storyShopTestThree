package com.example.storyshoptestthree.entity.product;


import com.example.storyshoptestthree.entity.product.ProductEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "description_product")
@NoArgsConstructor
@AllArgsConstructor
public class DescriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "description_product_id")
    private Integer id;

    @Column(name = "description_product_name")
    private String nameDiscription;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "description", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<ProductEntity> listdescription;

    public DescriptionEntity(String nameDiscription) {
        this.nameDiscription = nameDiscription;
    }
}
