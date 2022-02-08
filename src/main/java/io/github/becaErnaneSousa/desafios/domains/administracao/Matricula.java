package io.github.becaErnaneSousa.desafios.domains.administracao;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private boolean status;

    @OneToOne
    private Aluno aluno;

    @OneToOne
    private Turma turma;

}