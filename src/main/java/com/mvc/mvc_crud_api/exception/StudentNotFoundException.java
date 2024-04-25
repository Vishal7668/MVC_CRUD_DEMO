package com.mvc.mvc_crud_api.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }


    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
