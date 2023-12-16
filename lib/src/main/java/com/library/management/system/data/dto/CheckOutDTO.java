package com.library.management.system.data.dto;


import com.library.management.system.data.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckOutDTO {
    LocalDate expirationDate;
    Integer numberOfBooks;
    List<Book> borrowedBooks;
}
