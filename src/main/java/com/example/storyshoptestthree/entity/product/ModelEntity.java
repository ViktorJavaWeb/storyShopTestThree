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
@Table(name = "model")
@NoArgsConstructor
@AllArgsConstructor
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Integer id;

    @Column(name = "model_name")
    private String nameModel;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "model", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<ProductEntity> listModel;

    public ModelEntity(String nameModel) {
        this.nameModel = nameModel;
    }
}
