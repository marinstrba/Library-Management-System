package com.library.management.system.service;

import com.library.management.system.data.dto.CheckOutDTO;
import com.library.management.system.data.entity.Book;
import com.library.management.system.data.entity.CheckOut;
import com.library.management.system.data.entity.User;
import com.library.management.system.data.repository.BookOrderRepository;
import com.library.management.system.data.repository.CheckOutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckOutService {

    private final BookOrderRepository bookOrderRepository;
    private final CheckOutRepository checkOutRepository;

    public void addBook(User user, CheckOut checkOut ,Book addBook)
    {
        bookOrderRepository.save(
                Book.builder()
                        .checkOut(user.getUserCheckOuts().get(checkOut.getId()))
                        .isAvailable(true)
                        .title(addBook.getTitle())
                        .author(addBook.getAuthor())
                        .storyDescription(addBook.getStoryDescription())
                        .publisher(addBook.getPublisher())
                        .publishYear(addBook.getPublishYear())
                        .build()
        );
    }

    public CheckOutDTO orderDetails(CheckOut checkOut)
    {
        return CheckOutDTO.builder()
                .expirationDate(checkOut.getExpirationDate())
                .numberOfBooks(checkOut.getNumberOfBooks())
                .borrowedBooks(checkOut.getBorrowedBooks())
                .build();
    }


    public void placeOrder(CheckOut checkOut)
    {
        checkOutRepository.save(
                checkOut
        );
    }

}
