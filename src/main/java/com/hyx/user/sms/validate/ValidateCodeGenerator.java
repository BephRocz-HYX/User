package com.hyx.user.sms.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Author: hyx
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);

}
