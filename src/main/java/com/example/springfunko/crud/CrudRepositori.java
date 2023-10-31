package com.example.springfunko.crud;

import com.example.springfunko.Funko.Funko;

import java.util.List;
import java.util.Optional;

// Definimos la interfaz de nuestro repositorio, con los métodos que vamos a usar
// T es el tipo de dato que vamos a usar, y ID el tipo de dato de la clave primaria
public interface CrudRepositori{
    List<Funko> findAll();
    Optional<Funko> findById(Long id);
    Funko save(Funko funko);
    Funko update(Funko funko);
    Funko deleteById(Long id);
   void deleteAll();

}
