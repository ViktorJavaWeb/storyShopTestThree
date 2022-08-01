package com.example.storyshoptestthree.entity.client;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "first_name")
@NoArgsConstructor
@AllArgsConstructor
public class FirstNameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "first_name_id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},
            mappedBy = "firstName", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ClientEntity> listClientFirstName;

    public FirstNameEntity(String firstName) {
        this.firstName = firstName;
    }
}
