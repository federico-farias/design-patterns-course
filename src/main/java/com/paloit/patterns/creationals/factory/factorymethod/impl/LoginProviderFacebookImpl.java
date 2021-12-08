package com.paloit.patterns.creationals.factory.factorymethod.impl;

import com.paloit.patterns.creationals.factory.factorymethod.LoginProvider;

public class LoginProviderFacebookImpl implements LoginProvider {

    @Override
    public void login(String userName, String password) {
        System.out.println(userName + " Inicio sesión con [Facebook]");
    }

}
