package com.paloit.patterns.creationals.factory.factory.impl;

import com.paloit.patterns.creationals.factory.factory.LoginProvider;

public class LoginProviderTwitterImpl implements LoginProvider {

    @Override
    public void login(String userName, String password) {
        System.out.println(userName + " Inicio sesión con [Twitter]");
    }

}
