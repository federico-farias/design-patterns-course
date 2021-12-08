package com.paloit.patterns.creationals.factory.factorymethod;

import com.paloit.patterns.creationals.factory.factorymethod.LoginProvider;
import com.paloit.patterns.creationals.factory.factorymethod.LoginProviderFactory;
import com.paloit.patterns.creationals.factory.factorymethod.SigninProvider;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {

    @Test
    void loginTest() {
        LoginProvider sessionInitiator = LoginProviderFactory.create(SigninProvider.FACEBOOK);
        sessionInitiator.login("federico", "contraseña");
    }

}