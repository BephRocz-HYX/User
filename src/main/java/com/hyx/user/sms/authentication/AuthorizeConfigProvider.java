package com.hyx.user.sms.authentication;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @Author: hyx
 * @Date: Create in 2018/3/31 15:02
 * @Description:
 */
public interface AuthorizeConfigProvider {

    void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config);
}