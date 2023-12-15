package com.library.management.system.data.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
    @Column(name="firstName")
    private String name;
    @Column(name="secondName")
    private String surname;
    @Column(name="emailContact")
    private String email;
    @Column(name="ageInYears")
    private Integer age;
    @OneToMany(mappedBy = "user")
    private List<CheckOut> userCheckOuts;

}
