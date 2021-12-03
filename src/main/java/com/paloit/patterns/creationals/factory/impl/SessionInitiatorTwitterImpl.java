package com.paloit.patterns.creationals.factory.impl;

import com.paloit.patterns.creationals.factory.LoginProvider;

public class SessionInitiatorTwitterImpl implements LoginProvider {

    @Override
    public void login(String userName, String password) {
        System.out.println(userName + " Inicio sesión con [Twitter]");
    }

}
