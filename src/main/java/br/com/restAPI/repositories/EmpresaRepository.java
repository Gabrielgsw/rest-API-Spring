package br.com.restAPI.repositories;

import br.com.restAPI.domain.Empresa;
import br.com.restAPI.domain.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
