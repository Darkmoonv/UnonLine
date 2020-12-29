package com.zs.ssm.ssmexception;

public class RegisteredException extends RuntimeException {
    public RegisteredException() {
        super();
    }

    public RegisteredException(String message) {
        super(message);
    }

    public RegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisteredException(Throwable cause) {
        super(cause);
    }
}
