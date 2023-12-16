package com.library.management.system.controllers;

import com.library.management.system.data.dto.BookViewDTO;
import com.library.management.system.errors.BookNotFoundException;
import com.library.management.system.service.BookService;
import com.library.management.system.data.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping(value="/books")
    public List<BookViewDTO> viewAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping(value="/find-book")
    public Book findBook(Integer Id)
    {
        Book book = bookService.findBookId(Id);
        if (book != null)
            return book;
        else
            throw new BookNotFoundException("Book was not found in our database.");
    }

    @PostMapping(value="/donate-book")
    public void donateBook(Book newBook)
    {
        bookService.addBookToLibrary(newBook);
    }

}
