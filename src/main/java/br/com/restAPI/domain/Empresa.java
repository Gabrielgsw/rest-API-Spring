package br.com.restAPI.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long telefone;
    private String cnpj;
    private String dominio;
    private int quantidadeFuncionarios;
    private String descricao;
    private String areaAtuacao;
    @OneToMany
    private List<Vaga> vagas;


}
