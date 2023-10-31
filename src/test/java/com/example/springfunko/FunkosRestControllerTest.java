package com.example.springfunko;


import com.example.springfunko.DTOS.FunkoMapper.FunkoMapper;
import com.example.springfunko.DTOS.Funkodto.FunkoRestDto;
import com.example.springfunko.Funko.Funko;
import com.example.springfunko.Service.FunkoServiceImpl;
import com.example.springfunko.controll.FunkosRestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@ExtendWith(MockitoExtension.class)
public class FunkosRestControllerTest {
    private final ObjectMapper mapper = new ObjectMapper();
    @MockBean
    FunkoServiceImpl controller;
    @MockBean
    FunkoMapper funkoMapper;
    MockMvc mockMvc; // Cliente MVC
    FunkoRestDto funkoRestDto=new FunkoRestDto(
            1,
            "Spiderman",
            12.0,
            1,
            "https://www.google.com/url?sa=i&url=;",
            Funko.Categoria.MARVEL
    ); String myEndpoint = "/api/Funko";

        @Autowired
    public FunkosRestControllerTest(FunkoServiceImpl controller, FunkoMapper funkoMapper) {
        this.controller = controller;
        this.funkoMapper = funkoMapper;
    }

    @Test
    void findAll() throws Exception {
    }



    @Test
    void save() {

    }
    @Test
    void findById() {

    }


}
