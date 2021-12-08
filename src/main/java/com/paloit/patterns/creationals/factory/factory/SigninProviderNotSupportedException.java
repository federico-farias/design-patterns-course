package com.paloit.patterns.creationals.factory.factory;

public class SigninProviderNotSupportedException extends RuntimeException {

    public SigninProviderNotSupportedException(String message) {
        super(message);
    }

}
