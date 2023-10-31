package com.example.springfunko.Service;

import com.example.springfunko.Funko.Funko;
import com.example.springfunko.crud.CrudRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.FunkoService;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
@ResponseStatus
public class FunkoServiceImpl implements FunkoService {

    private final CrudRepositori funkoRepository;

    @Autowired
    public FunkoServiceImpl(CrudRepositori funkoRepository1) {
        this.funkoRepository = funkoRepository1;
    }

    @Override
    public List<Funko> findAll() {
        return funkoRepository.findAll();
    }


    @Override
    public Funko findById(long id) {
        return funkoRepository.findById(id).orElse(null);

    }

    @Override
    public Funko save(Funko funko) {
        Funko save = funkoRepository.save(funko);
        return save;
    }



    @Override
    public Funko update(Funko funko) {
        return  funkoRepository.save(funko);
    }

    @Override
    public Funko deleteById(long id) {
        return null;
    }
/*
    @Override
    public Funko deleteById(long id) {
        return funkoRepository.deleteById(id);
    }
*/
}