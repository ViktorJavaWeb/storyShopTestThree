package com.example.storyshoptestthree.entity.product;



import com.example.storyshoptestthree.entity.client.ClientEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "product_name")
   // @JsonProperty //@JsonProperty("user")
    private String nameProduct;


    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "fk_brand_id")
    @JsonBackReference
    private BrandEntity brand;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_model_id")
    @JsonBackReference
    private ModelEntity model;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_color_id")
    @JsonBackReference
    private ColorEntity color;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_description_product_id")
    @JsonBackReference
    private DescriptionEntity description;

}
