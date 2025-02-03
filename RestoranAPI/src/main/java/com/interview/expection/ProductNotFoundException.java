package com.interview.expection;

public class ProductNotFoundException extends RuntimeException {
    private final String errorCode;

    public ProductNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ProductNotFoundException(String message) {
        super(message);
        this.errorCode = "Product not found!";
    }

    public String getErrorCode() {
        return errorCode;
    }
}
