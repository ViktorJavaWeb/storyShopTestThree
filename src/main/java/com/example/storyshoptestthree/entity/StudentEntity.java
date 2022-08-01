package com.example.storyshoptestthree.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "student_first_name", unique = true, nullable = false)
    private String firstName;

    @Column(name = "student_last_name", unique = true, nullable = false)
    private String lastName;

    @Column(name = "student_email", unique = true, nullable = true)
    private String email;


}
