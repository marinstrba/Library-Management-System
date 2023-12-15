package com.library.management.system.data.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
@Table(name="libraryUsers")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Integer Id;
    private String name;
    private String surname;

    private String email;

    private Integer age;

    private List<Book> bookOrdersList;

}
