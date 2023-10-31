package com.example.springfunko;

import com.example.springfunko.Funko.Funko;
import com.example.springfunko.Repository.RepositoriImpl;
import com.example.springfunko.Service.FunkoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class FunkoServiceImplTest {

    @InjectMocks
    private FunkoServiceImpl funkoService;

    @Mock
    private RepositoriImpl funkoRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
     void testFindAll() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        Funko funko2 = new Funko( 2L, "Funko 2", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        List<Funko> funkoList = Arrays.asList(funko, funko2);
        when(funkoRepository.findAll()).thenReturn(funkoList);

        List<Funko> result = funkoService.findAll();

        assertNotNull(result);
        assertEquals(2, result.size());
        verify(funkoRepository, times(1)).findAll();
    }

    @Test
     void testFindById() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        when(funkoRepository.findById(1L)).thenReturn(Optional.of(funko));
        Funko result= funkoService.findById(1L);
        assertEquals(1L, result.getId());
        verify(funkoRepository, times(1)).findById(1L);
    }

    @Test
     void testSave() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        when(funkoRepository.save(funko)).thenReturn(funko);

        Funko result = funkoService.save(funko);

        assertNotNull(result);
        verify(funkoRepository, times(1)).save(funko);
    }

    @Test
     void testUpdate() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        when(funkoRepository.findById(1L)).thenReturn(Optional.of(funko));
        when(funkoRepository.save(funko)).thenReturn(funko);
    }

    @Test
     void testDeleteById() {
        Funko funko = new Funko( 1L, "Funko 1", 10.0, 3, "pnj", Funko.Categoria.MARVEL, null, null);
        funko.setId(1L);

    }


}