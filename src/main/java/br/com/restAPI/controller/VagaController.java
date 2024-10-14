package br.com.restAPI.controller;


import br.com.restAPI.domain.Vaga;
import br.com.restAPI.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

    @GetMapping("/{id}")
    public ResponseEntity<Vaga> buscarPorId(@PathVariable Long id) {
        Optional<Vaga> vaga = vagaService.buscarPorId(id);
        if (vaga.isPresent()) {
            return ResponseEntity.ok(vaga.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Vaga criarVaga(@RequestBody Vaga vaga) {
        return vagaService.salvar(vaga);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vaga> atualizarVaga(@PathVariable Long id, @RequestBody Vaga vaga) {
        Vaga vagaAtualizada = vagaService.atualizarVaga(id, vaga);
        if (vagaAtualizada != null) {
            return ResponseEntity.ok(vagaAtualizada);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirVaga(@PathVariable Long id) {
        vagaService.removerVaga(id);
        return ResponseEntity.noContent().build();
    }

}
