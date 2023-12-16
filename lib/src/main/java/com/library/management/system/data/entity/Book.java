package com.library.management.system.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column(name="available")
    private Boolean isAvailable;
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
