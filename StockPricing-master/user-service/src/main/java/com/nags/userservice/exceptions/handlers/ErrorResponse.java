package com.nags.userservice.exceptions.handlers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private int statusCode;
    private Date exceptionTime;
}
