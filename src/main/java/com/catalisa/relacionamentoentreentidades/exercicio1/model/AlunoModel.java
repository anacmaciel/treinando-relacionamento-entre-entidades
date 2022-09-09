package com.catalisa.relacionamentoentreentidades.exercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "aluno")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeAluno;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_trabalho",
            joinColumns = {@JoinColumn(name = "aluno_id",
                    referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "trabalho_id",
                    referencedColumnName = "id")})
    private TrabalhoModel trabalho;
}
