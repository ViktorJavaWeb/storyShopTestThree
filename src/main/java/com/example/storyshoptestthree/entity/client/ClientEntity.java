package com.example.storyshoptestthree.entity.client;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class ClientEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "fk_first_name_id")
    @JsonBackReference
    private FirstNameEntity firstName;

    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "fk_last_name_id")
    @JsonBackReference
    private LastNameEntity lastName;

    @Column(name = "client_age")
    private String age;

    @Column(name = "client_phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},
            mappedBy = "clientEntity", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<VisitorEntity> listVisitor;
}
