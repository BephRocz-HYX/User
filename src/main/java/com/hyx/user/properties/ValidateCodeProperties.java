package com.hyx.user.properties;

/**
 * @Author: hyx
 * @Description:    验证码相关的配置
 */
public class ValidateCodeProperties {


    private SmsCodeProperties sms = new SmsCodeProperties();

    public SmsCodeProperties getSms() {
        return sms;
    }

    public void setSms(SmsCodeProperties sms) {
        this.sms = sms;
    }
}
