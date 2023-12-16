package com.library.management.system.controllers;

import com.library.management.system.data.dto.CheckOutDTO;
import com.library.management.system.data.entity.Book;
import com.library.management.system.data.entity.CheckOut;
import com.library.management.system.data.entity.User;
import com.library.management.system.service.CheckOutService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CheckOutController {
    private final CheckOutService checkOutService;

    @PostMapping(value="/add-book")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBookToCheckOut(User user, CheckOut checkOut, Book book)
    {
        checkOutService.addBook(user, checkOut, book);
    }
    @GetMapping(value="/order-details")
    public CheckOutDTO getOrderDetails(CheckOut checkOut)
    {
        return checkOutService.orderDetails(checkOut);
    }

    @PostMapping(value="/place-order")
    @ResponseStatus(HttpStatus.CREATED)
    public void placeBookOrder(CheckOut checkOut)
    {
        checkOutService.placeOrder(checkOut);
    }
}
