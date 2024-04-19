package com.mvc.MVC_CRUD_API.exception;

public class ClassNotFoundException extends RuntimeException{

    public ClassNotFoundException(String message) {
        super(message);
    }


    public ClassNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
