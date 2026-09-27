package com.example.t1_feigngrupo9.service;

import com.example.t1_feigngrupo9.client.BreweryClient;
import com.example.t1_feigngrupo9.model.BreweryData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BreweryServiceTest {

    @Mock
    private BreweryClient breweryClient;

    @InjectMocks
    private BreweryService breweryService;

    @Test
    void debeFiltrarCerveceriasMicroDeCalifornia(){
        BreweryData brewery1 = new BreweryData();
        brewery1.setId("1");
        brewery1.setName("Micro California");
        brewery1.setBreweryType("micro");
        brewery1.setState("California");

        BreweryData brewery2 = new BreweryData();
        brewery2.setId("2");
        brewery2.setName("Grande California");
        brewery2.setBreweryType("large");
        brewery2.setState("California");

        BreweryData brewery3 = new BreweryData();
        brewery3.setId("3");
        brewery3.setName("Micro Texas");
        brewery3.setBreweryType("micro");
        brewery3.setState("Texas");

        when(breweryClient.getBreweries())
                .thenReturn(List.of(brewery1, brewery2, brewery3));
        List<BreweryData> resultado = breweryService.obtenerCerveceriasMicroCalifornia();

        assertEquals(1, resultado.size());
        assertEquals("Micro California", resultado.get(0).getName());
        assertEquals("micro", resultado.get(0).getBreweryType());
        assertEquals("California", resultado.get(0).getState());
    }
}
