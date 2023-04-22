package com.knoldus.springbootJPA.exception;

public class EmptyInputException extends RuntimeException{
    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public EmptyInputException(String errorCode,String errorMessage){
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }
}
