package com.reading.server.serverImpl;

public class BookParseException extends Exception {
    public BookParseException(String message) {
        super(message);
    }

    public BookParseException(String message,Throwable cause) {
        super(message, cause);
    }
}
