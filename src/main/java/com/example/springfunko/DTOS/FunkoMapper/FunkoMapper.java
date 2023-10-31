package com.example.springfunko.DTOS.FunkoMapper;

import com.example.springfunko.DTOS.Funkodto.FunkoRestDto;
import com.example.springfunko.Funko.Funko;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class FunkoMapper {
    public FunkoRestDto toFunkoDTO(Funko funko){
       return new FunkoRestDto(
                funko.getId(),
                funko.getName(),
                funko.getPrice(),
                funko.getCantidad(),
                funko.getImage(),
                funko.getCategoria()
         );

    }
    public List<FunkoRestDto> toFunkoDTO(List<Funko> funko){
        return funko.stream().map(this::toFunkoDTO).toList();
    }

}
