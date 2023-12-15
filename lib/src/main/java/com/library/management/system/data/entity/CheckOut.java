package com.library.management.system.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="checkOuts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckOut {
    @Id
    @GeneratedValue
    private Integer Id;
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;
    @Column(name="dateOfReturn")
    private LocalDate expirationDate;
    @Column(name="itemCount")
    private Integer numberOfBooks;
    @Column(name="returnStatus")
    private Boolean isReturned;
    @OneToMany(mappedBy = "checkOut")
    private List<Book> borrowedBooks;
}
