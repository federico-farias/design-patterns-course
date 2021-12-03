package com.paloit.patterns.creationals.factory;

import com.paloit.patterns.creationals.factory.impl.SessionInitiatorFacebookImpl;
import com.paloit.patterns.creationals.factory.impl.SessionInitiatorGoogleImpl;
import com.paloit.patterns.creationals.factory.impl.SessionInitiatorTwitterImpl;

public class LoginProviderFactory {

    public static LoginProvider create(SigninProvider provider) {
        if (provider == null) {
            throw new SigninProviderNotSupportedException("Proveedor de inicio de sesión no especificado.");
        }
        switch (provider) {
            case FACEBOOK:
                return new SessionInitiatorFacebookImpl();
            case GOOGLE:
                return new SessionInitiatorGoogleImpl();
            case TWITTER:
                return new SessionInitiatorTwitterImpl();
            default:
                throw new SigninProviderNotSupportedException("Proveedor de inicio de sesión no especificado.");
        }
    }

}
