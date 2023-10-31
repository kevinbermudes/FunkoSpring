package com.example.springfunko.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ErrorDeServidor extends RuntimeException{

    public ErrorDeServidor(String message) {
        super(message);
    }
}
