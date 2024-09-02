package com.example.microservice.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Clase para para manejar el error de formato inválido
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidFormatException extends RuntimeException {
    public InvalidFormatException(String message) {
        super(message);
    }
}