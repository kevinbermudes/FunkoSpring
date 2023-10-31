package com.example.springfunko;

import com.example.springfunko.Funko.Funko;
import com.example.springfunko.Repository.RepositoriImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RepositoriImplTest {

    private RepositoriImpl funkoRepository;
    @BeforeEach
    public void setUp() {
        funkoRepository = new RepositoriImpl();
    }
    @Test
    void testFindAll() {
        List<Funko> funkoList= funkoRepository.findAll();
        assertNotNull(funkoList);
        assertEquals(7, funkoList.size());
    }
    @Test
    void testFindById() {
        Funko funko = funkoRepository.findById(1L).orElse(null);
        assertNotNull(funko);
        assertEquals(1L, funko.getId());
    }
    @Test
    void testFinIdNotFound() {
        Funko funko = funkoRepository.findById(10L).orElse(null);
        assertEquals(null, funko);
    }
    @Test
    void testSave() {
        Funko funko = new Funko( 8L, "Funko 8", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        funkoRepository.save(funko);
        assertEquals(8, funkoRepository.findAll().size());
    }
    @Test
    void testUpdate() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        funkoRepository.update(funko);
        assertEquals(7, funkoRepository.findAll().size());
    }
    @Test
    void testDeleteById() {
        funkoRepository.deleteById(1L);
        assertEquals(6, funkoRepository.findAll().size());
    }
    @Test
    void testDeleteAll() {
        funkoRepository.deleteAll();
        assertEquals(0, funkoRepository.findAll().size());
    }
    @Test
    void testDeleteByIdNotFound() {
        funkoRepository.deleteById(10L);
        assertEquals(7, funkoRepository.findAll().size());
    }
    @Test
    void testUpdateNotFound() {
        Funko funko = new Funko( 10L, "Funko 10", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        funkoRepository.update(funko);
        assertEquals(8, funkoRepository.findAll().size());
    }
}
