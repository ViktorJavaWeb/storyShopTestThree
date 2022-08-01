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
@Table(name = "last_name")
@NoArgsConstructor
@AllArgsConstructor
public class LastNameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "last_name_id")
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},
            mappedBy = "lastName", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ClientEntity> listClientLastName;



    public LastNameEntity(String lastName) {
        this.lastName = lastName;
    }
}
