package com.example.demo.service;


import com.example.springfunko.Funko.Funko;


import java.util.List;
import java.util.Optional;


public interface FunkoService {

    List<Funko> findAll();


    Funko findById(long id);

    Funko save(Funko funko);

    Funko update(Funko funko);

    Funko deleteById(long id);

}