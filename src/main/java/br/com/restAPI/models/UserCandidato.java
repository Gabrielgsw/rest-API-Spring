package br.com.restAPI.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="candidatos")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String nome;

    private String email;

    private String telefone;

    private String endereco;
    @Column(columnDefinition = "TEXT",unique = true)
    private String cpf;
}
