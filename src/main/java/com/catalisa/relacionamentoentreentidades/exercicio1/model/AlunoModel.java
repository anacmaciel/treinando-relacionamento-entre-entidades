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
    @OneToMany(mappedBy = "alunos", cascade = CascadeType.ALL)
    private List<TrabalhoModel> trabalhos;
}
