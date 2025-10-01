package com.ingsofuniversidad.holamundo;

import org.springframework.stereotype.Service;

@Service
public class HolaMundoService {

    public String hola(String nombre){
        return "Hola" + nombre;
    }
}
