package com.library.management.system.service;

import com.library.management.system.data.dto.BookViewDTO;
import com.library.management.system.data.entity.Book;
import com.library.management.system.data.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    public List<BookViewDTO> getAllBooks()
    {
        return bookRepository.findAll().stream().map(
                book -> {
                    return BookViewDTO.builder()
                            .isAvailable(book.getIsAvailable())
                            .title(book.getTitle())
                            .author(book.getAuthor())
                            .storyDescription(book.getStoryDescription())
                            .build();
                }
        ).collect(Collectors.toList());
    }

    public Book findBookId(Integer Id)
    {
        return bookRepository.findById(Id).orElse(null);
    }

    public void addBookToLibrary(Book newBook)
    {
        bookRepository.save(
                Book.builder()
                        .isAvailable(true)
                        .title(newBook.getTitle())
                        .author(newBook.getAuthor())
                        .storyDescription(newBook.getStoryDescription())
                        .publisher(newBook.getPublisher())
                        .publishYear(newBook.getPublishYear())
                        .build()
        );
    }
}
