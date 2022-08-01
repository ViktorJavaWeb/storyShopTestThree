package com.example.storyshoptestthree.entity.product;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "color")
@NoArgsConstructor
@AllArgsConstructor
public class ColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private Integer id;

    @Column(name = "color_name")
    private String nameColor;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},
            mappedBy = "color", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<ProductEntity> listColor;

    public ColorEntity(String nameColor) {
        this.nameColor = nameColor;
    }
}
