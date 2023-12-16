package com.library.management.system.errors;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String errorMessage)
    {
        super(errorMessage);
    }

}
