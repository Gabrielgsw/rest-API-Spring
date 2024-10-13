package br.com.restAPI.service;

import br.com.restAPI.domain.Vaga;
import br.com.restAPI.repositories.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {

    @Autowired
    private VagasRepository vagasRepository;

    public List<Vaga> listarVagas() {
        return vagasRepository.findAll();
    }

    public Optional<Vaga> buscarPorId(Long id) {
        return vagasRepository.findById(id);
    }

    public Vaga salvar(Vaga vaga) {
        return vagasRepository.save(vaga);
    }

    public Vaga atualizarVaga(Long id, Vaga novaVaga) {
        Optional<Vaga> vagaExistente = buscarPorId(id);
        if(vagaExistente.isPresent()){
            Vaga v = vagaExistente.get();
            v.setTitulo(novaVaga.getTitulo());
            v.setDescricao(novaVaga.getDescricao());
            v.setEmpresa(novaVaga.getEmpresa());
            v.setRemuneracao(novaVaga.getRemuneracao());
            v.setQuantidadeCandidatados(novaVaga.getQuantidadeCandidatados());
            return vagasRepository.save(v);
        }
        return null;
    }

    public void removerVaga(Long id) {
        vagasRepository.deleteById(id);
    }
}
