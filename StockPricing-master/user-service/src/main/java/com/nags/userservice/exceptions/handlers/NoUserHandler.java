package com.nags.userservice.exceptions.handlers;

import com.nags.userservice.exceptions.AccountActivationException;
import com.nags.userservice.exceptions.UserNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;


@ControllerAdvice
public class NoUserHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handlingResponse(UserNotFound exception) {

        return new ResponseEntity<>(
                new ErrorResponse(
                        exception.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        new Date()
                ),
                HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErrorResponse> handlingReponse2(AccountActivationException exception) {
        return new ResponseEntity<>(new ErrorResponse(
                exception.getMessage(),
                HttpStatus.NOT_ACCEPTABLE.value(),
                new Date()
        ), HttpStatus.NOT_ACCEPTABLE);
    }

}
