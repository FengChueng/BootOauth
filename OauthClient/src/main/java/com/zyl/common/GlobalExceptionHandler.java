package com.zyl.common;

import org.springframework.security.oauth2.common.exceptions.UserDeniedAuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Administrator on 2018/12/24.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserDeniedAuthorizationException.class)
    public String userDeniedAuthorizationException(Exception exception){
        return "用户拒绝授权";
    }

}
