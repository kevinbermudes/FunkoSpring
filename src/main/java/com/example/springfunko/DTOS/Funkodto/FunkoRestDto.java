package com.example.springfunko.DTOS.Funkodto;

import com.example.springfunko.Funko.Funko;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

public class FunkoRestDto {

    @Min(value = 0, message = "El id del funko no puede ser negativo")
    @NotBlank(message = "El id del funko no puede estar vacío")

    private  long id;
    @NotBlank(message = "El nombre del funko no puede estar vacío")
    private  String name;

    @PositiveOrZero(message = "El precio del funko no puede ser negativo")
    private    Double price;
    @PositiveOrZero(message = "El precio del funko no puede ser negativo")

    private    int cantidad;

    private    String  image;
    @Pattern(regexp = "MARVEL|DISNEY|ANIME|OTROS", message = "La categoria debe ser MARVEL, DISNEY, ANIME u OTROS")
    private Funko.Categoria categoria;


    public FunkoRestDto(long id, String name, Double price, int cantidad, String image, Funko.Categoria categoria) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cantidad = cantidad;
        this.image = image;
        this.categoria = categoria;
    }


}
