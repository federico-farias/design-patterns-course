package com.paloit.patterns.creationals.factory.factory;

import com.paloit.patterns.creationals.factory.factory.impl.LoginProviderFacebookImpl;
import com.paloit.patterns.creationals.factory.factory.impl.LoginProviderGoogleImpl;
import com.paloit.patterns.creationals.factory.factory.impl.LoginProviderTwitterImpl;

public class LoginProviderFactory {

    public static LoginProvider create(SigninProvider provider) {
        if (provider == null) {
            throw new SigninProviderNotSupportedException("Proveedor de inicio de sesión no especificado.");
        }
        switch (provider) {
            case FACEBOOK:
                return new LoginProviderFacebookImpl();
            case GOOGLE:
                return new LoginProviderGoogleImpl();
            case TWITTER:
                return new LoginProviderTwitterImpl();
            default:
                throw new SigninProviderNotSupportedException("Proveedor de inicio de sesión no especificado.");
        }
    }

}
