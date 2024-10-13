package br.com.restAPI.controller;


import br.com.restAPI.domain.Vaga;
import br.com.restAPI.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/vaga")
public class VagaController {

    @Autowired
    private VagaService vagaService;

    @GetMapping
    public List<Vaga> listarVagas() {
        return vagaService.listarVagas();
    }


}
