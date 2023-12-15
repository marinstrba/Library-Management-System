package com.library.management.system.data.entity;


import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    @GeneratedValue
    private Integer Id;
    private String name;
    private String surname;

    private String email;

    private Integer age;

    private List<Books> bookOrdersList;

}
