package com.example.springfunko.controll;

import com.example.springfunko.DTOS.FunkoMapper.FunkoMapper;
import com.example.springfunko.Funko.Funko;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.FunkoService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
@Slf4j
public class FunkosRestController {
    private final FunkoService funkoService;
    private final FunkoMapper funkoMapper;

    @Autowired
    public FunkosRestController(FunkoService funkoService, FunkoMapper funkoMapper) {
        this.funkoService = funkoService;
        this.funkoMapper = funkoMapper;
    }

    @GetMapping("/funkos")
    public ResponseEntity<List<Funko>> findAll() {
        return ResponseEntity.ok( funkoService.findAll());
    }

    @PostMapping("/funkos")
    public ResponseEntity<Funko> toFunkoDTO(@Valid @RequestBody Funko funko) {
        return ResponseEntity.ok(funkoService.save(funko));
    }

    @GetMapping("/funkos/{id}")
    public ResponseEntity<Funko> getFunkoById(@PathVariable long id) {
        return ResponseEntity.ok(funkoService.findById(id));
    }


    @PutMapping("/funkos")
    public ResponseEntity<Funko> updateFunko(@RequestBody Funko funko) {
        return ResponseEntity.ok(funkoService.save(funko));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Funko> patchFunko(@RequestBody Funko funko) {
        return ResponseEntity.ok(funkoService.update(funko));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Funko> deleteFunko(@PathVariable Long id) {
        return ResponseEntity.ok(funkoService.deleteById(id));
    }

}