package com.example.block7crudvalidation.entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person", nullable = false)
    private int id_person;

    @Column(name = "user", nullable = false, length = 10)
    private String user;
    @Column(name = "person_password", nullable = false)
    private String password;
    @Column(name = "person_name", nullable = false, length = 10)
    private String name;
    @Column(name = "person_surname")
    private String surname;

    @Column(name = "personal_email", nullable = false)
    private String company_email;

    @Column(name = "company_email", nullable = false)
    private String personal_email;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_at")
    private Date created_date = new Date();

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "image_url")
    private String image_url;

    @Column(name= "LastDate")
    private Date termination_date = new Date();

}
/*
 id_persona int [pk, increment]
  usuario string [not null max-length: 10 min-length: 6]
  password string  [not null]
  name string [not null]
  surname string
  company_email string  [not null ]
  personal_email string [not null]
  city string [not null]
  active boolean  [not null]
  created_date date  [not null]
  imagen_url string
  termination_date date

 */
