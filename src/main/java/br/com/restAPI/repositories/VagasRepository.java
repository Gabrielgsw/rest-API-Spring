package br.com.restAPI.repositories;

import br.com.restAPI.domain.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagasRepository extends JpaRepository<Vaga, Long> {

}
