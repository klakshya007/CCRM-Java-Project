package edu.ccrm.exception;

public class MaxCreditLimitExceededException extends RuntimeException {
    public MaxCreditLimitExceededException(String msg) {
        super(msg);
    }
}