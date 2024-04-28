package com.nesProject.screenmatch.exceptions;

public class TimeConversionException extends RuntimeException {

    private String message;

    public TimeConversionException(String message) {
        this.message = message;
    }

    /**
     * Retrieves the exception message.
     * @return The exception message.
     */
    public String getMessage() {
        return this.message;
    }
}
