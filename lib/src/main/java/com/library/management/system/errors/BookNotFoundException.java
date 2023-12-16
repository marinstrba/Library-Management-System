package com.library.management.system.errors;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
