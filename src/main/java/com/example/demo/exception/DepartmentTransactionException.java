package com.example.demo.exception;

public class DepartmentTransactionException extends Exception {

    private static final String message = "I can't found this department";

    public DepartmentTransactionException(String message) {
        super(message);
    }
}
