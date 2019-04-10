package com.denis.bsu.lab10.airline.exceptions;

public class EmptyException extends RuntimeException {
    public EmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyException(Throwable cause) {
        super(cause);
    }

    public EmptyException(String message) {
        super(message);
    }
}
