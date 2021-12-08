package com.paloit.patterns.creationals.factory.factory;

import com.paloit.patterns.creationals.factory.factory.LoginProvider;
import com.paloit.patterns.creationals.factory.factory.LoginProviderFactory;
import com.paloit.patterns.creationals.factory.factory.SigninProvider;
import org.junit.jupiter.api.Test;

class LoginProviderTest {

    @Test
    void loginTest() {
        LoginProvider sessionInitiator = LoginProviderFactory.create(SigninProvider.FACEBOOK);
        sessionInitiator.login("federico", "contraseña");
    }

}