package com.interview.expection;

public class MenuNotFoundException extends RuntimeException {
    private final String errorCode;

    public MenuNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public MenuNotFoundException(String message) {
        super(message);
        this.errorCode = "Menu not found!";
    }

    public String getErrorCode() {
        return errorCode;
    }
}