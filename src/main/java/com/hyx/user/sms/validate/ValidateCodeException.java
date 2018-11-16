package com.hyx.user.sms.validate;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: hyx
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
