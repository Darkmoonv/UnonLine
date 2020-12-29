package com.zs.ssm.ssmexception;
//没有登陆就访问，抛出拒绝访问异常
public class AccessDeniedException extends RuntimeException {
    public AccessDeniedException() {
        super();
    }

    public AccessDeniedException(String message) {
        super(message);
    }

    public AccessDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDeniedException(Throwable cause) {
        super(cause);
    }

}
