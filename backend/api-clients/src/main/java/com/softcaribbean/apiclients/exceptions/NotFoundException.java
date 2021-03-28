package com.softcaribbean.apiclients.exceptions;

public class NotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    private final int code;

    public NotFoundException(int code) {
        super();
        this.code = code;
    }

    public NotFoundException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public NotFoundException(String message, int code) {
        super(message);
        this.code = code;
    }

    public NotFoundException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}
