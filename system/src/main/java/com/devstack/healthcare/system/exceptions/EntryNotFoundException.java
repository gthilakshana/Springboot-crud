package com.devstack.healthcare.system.exceptions;

public class EntryNotFoundException extends RuntimeException{
    public EntryNotFoundException(String message) {
        super(message);

    }
}
