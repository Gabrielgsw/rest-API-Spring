package br.com.restAPI.controllers;


import br.com.restAPI.models.Vaga;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class VagaController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/vaga")
    public Vaga vaga() {
        
    }

}
