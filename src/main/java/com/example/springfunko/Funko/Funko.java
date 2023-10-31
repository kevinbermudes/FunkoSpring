package com.example.springfunko.Funko;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FUNKO")
public class Funko {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "nombre", nullable = false, length = 50)
    @NotBlank(message = "El nombre no puede estar vacío")
    @NotBlank(message = "El nombre del funko no puede estar vacío")

    private  String name;
    @Column(name= "precio", nullable = false)
    private    Double price;
    @Column(name= "cantidad", nullable = false)
    private    int cantidad;
    @Column(name= "imagen", nullable = false)
    private    String  image;
    @Column(name= "categoria", nullable = false)
    private    Categoria categoria;
    private    Date fechaCreacion;
    private    Date fechaActualizacion;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Categoria {
        MARVEL, DISNEY, ANIME, OTROS
    }

}
