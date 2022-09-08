    package com.catalisa.relacionamentoentreentidades.exercicio1.model;

    import com.catalisa.relacionamentoentreentidades.exercicio1.model.AlunoModel;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import javax.persistence.*;
    import java.util.List;

    @Entity
    @Data
    @NoArgsConstructor
    @Table(name = "trabalho")
    public class TrabalhoModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String tituloTrabalho;
        @OneToMany
        @JoinColumn(name = "aluno_id", referencedColumnName = "id")
        private List<AlunoModel> alunos;
    }
