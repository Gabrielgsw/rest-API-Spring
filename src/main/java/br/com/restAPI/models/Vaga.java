package br.com.restAPI.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vagas")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 50,columnDefinition = "TEXT")
    private String titulo;
    private String descricao;
    private Double remuneracao;
    private int quantidadeCandidatados;

    @ManyToOne
    @JoinColumn(name ="vaga_id")
    private UserEmpresa empresa;
}
