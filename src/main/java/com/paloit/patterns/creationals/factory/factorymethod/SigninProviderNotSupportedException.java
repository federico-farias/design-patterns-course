package com.paloit.patterns.creationals.factory.factorymethod;

public class SigninProviderNotSupportedException extends RuntimeException {

    public SigninProviderNotSupportedException(String message) {
        super(message);
    }

}
