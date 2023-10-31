package com.example.springfunko.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotFound extends RuntimeException{

    public NotFound(String message) {
        super(message);
    }
}
