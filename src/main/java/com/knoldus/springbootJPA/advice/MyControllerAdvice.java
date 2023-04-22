package com.knoldus.springbootJPA.advice;

import com.knoldus.springbootJPA.exception.EmptyInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
        return new ResponseEntity<>("Input field is empty,Please look into it", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException){
        return new ResponseEntity<>("No value is present in DB, please change your request", HttpStatus.NOT_FOUND);
    }
//    @ExceptionHandler(NoHandlerFoundException.class)
//    public ResponseEntity<String> handleNoHandlerFoundException(NoHandlerFoundException elementException){
//        return new ResponseEntity<>("Page Not Found, Invalid Request", HttpStatus.NOT_FOUND);
//    }

}
