package br.com.restAPI.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name="empresas")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String name;
    private String dominio;
    @Column(columnDefinition = "TEXT",unique=true)
    private String cnpj;
    private String telefone;
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vaga> vagas;

}
