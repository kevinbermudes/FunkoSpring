package com.example.springfunko.Repository;

import com.example.springfunko.Funko.Funko;
import com.example.springfunko.crud.CrudRepositori;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;


@Component
@Repository
public class RepositoriImpl implements CrudRepositori{
    private final Map<Long,Funko> funkos;


    public RepositoriImpl() {
        this.funkos = new LinkedHashMap<Long, Funko>();
        Date currentDate = new Date();
        funkos.put(1L, new Funko(1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, currentDate, currentDate));
        funkos.put(2L, new Funko(2L, "Funko 2", 20.0, 6, "jpg", Funko.Categoria.DISNEY, currentDate, currentDate));
        funkos.put(3L, new Funko(3L, "Funko 3", 32.0, 99, "png", Funko.Categoria.DISNEY, currentDate, currentDate));
        funkos.put(4L, new Funko(4L, "Funko 4", 45.0, 2, "gif", Funko.Categoria.OTROS, currentDate, currentDate));
        funkos.put(5L, new Funko(5L, "Funko 5", 51.0, 5, "jpg", Funko.Categoria.ANIME, currentDate, currentDate));
        funkos.put(6L, new Funko(6L, "Funko 6", 61.0, 1, "png", Funko.Categoria.ANIME, currentDate, currentDate));
        funkos.put(7L, new Funko(7L, "Funko 7", 71.0, 0, "gif", Funko.Categoria.ANIME, currentDate, currentDate));
    }

    @Override
    public List<Funko> findAll() {

        return List.copyOf(funkos.values());
    }

    @Override
    public Optional<Funko> findById(Long id) {
        return Optional.ofNullable(funkos.put(id, funkos.get(id)));
    }

    @Override
    public Funko save(Funko funko) {
        return funkos.put(funko.getId(), funko);
    }


    public Funko update(Funko funko) {
        return funkos.put(funko.getId(), funko);
    }

    @Override
    public Funko deleteById(Long id) {
        return funkos.remove(id);
    }


    @Override
    public void deleteAll() {
        funkos.clear();
    }
}
