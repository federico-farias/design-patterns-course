package com.paloit.patterns.creationals.factory;

public class SigninProviderNotSupportedException extends RuntimeException {

    public SigninProviderNotSupportedException(String message) {
        super(message);
    }

}
