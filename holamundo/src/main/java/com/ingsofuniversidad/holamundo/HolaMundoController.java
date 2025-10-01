package com.ingsofuniversidad.holamundo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HolaMundoController {

    @Autowired
    HolaMundoService servicio;

    @GetMapping("/hola")  /* Get, traigame la pagina */
        public String hola(
        @RequestParam(defaultValue = "") String nombre
        ){
            return servicio.hola(nombre);
        }

    @GetMapping("/suma")
        public String suma(
            @RequestParam Integer a, @RequestParam Integer b){
            return "" + (a+b);
        }
}
