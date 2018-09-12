package com.example.demo.exception;

public class SalaryTransactionException extends Exception {

    private static final long serialVersionUID = -3128681006635769411L;

    public SalaryTransactionException(String message) {
        super(message);
    }

}