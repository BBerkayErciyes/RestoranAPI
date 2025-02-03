package com.interview.expection;

public class CategoryNotFoundException extends RuntimeException {
    private final String errorCode;

    public CategoryNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public CategoryNotFoundException(String message) {
        super(message);
        this.errorCode = "Category not found!";
    }

    public String getErrorCode() {
        return errorCode;
    }
}
