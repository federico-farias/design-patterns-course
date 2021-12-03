package com.paloit.patterns.creationals.factory;

import org.junit.jupiter.api.Test;

class LoginProviderTest {

    @Test
    void loginTest() {
        LoginProvider sessionInitiator = LoginProviderFactory.create(SigninProvider.FACEBOOK);
        sessionInitiator.login("federico", "contraseña");
    }

}