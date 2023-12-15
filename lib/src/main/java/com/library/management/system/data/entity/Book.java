package com.library.management.system.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column(name="bookTitle")
    private String title;
    @Column(name="bookAuthor")
    private String author;
    @Column(name="bookStory")
    private String storyDescription;
    @Column(name="bookPublisher")
    private String publisher;
    @Column(name="bookPublishYear")
    private Integer publishYear;
    @ManyToOne
    @JoinColumn(name="bookItems")
    private CheckOut checkOut;
}
