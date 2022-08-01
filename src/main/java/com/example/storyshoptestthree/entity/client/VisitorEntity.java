package com.example.storyshoptestthree.entity.client;


import com.example.storyshoptestthree.entity.client.ClientEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "visitor")
public class VisitorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visitor_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "fk_client_id")
    @JsonBackReference
    private ClientEntity clientEntity;

    @Column(name = "visitor_ip")
    private String visitor_ip;

   // @Column(name = "visitor_dataTime")
    private Date dateVisit;


}
