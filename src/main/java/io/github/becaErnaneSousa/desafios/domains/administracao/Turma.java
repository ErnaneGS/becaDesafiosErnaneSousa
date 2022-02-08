package io.github.becaErnaneSousa.desafios.domains.administracao;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidadeAluno;
    private boolean status;
    private String dataInicio;
    private String dataFim;

    @ManyToOne
    private Curso curso;

    @OneToOne
    private Professor professor;

    @OneToMany
    private List<Matricula> listaMatriculas;

    @OneToMany
    private List<Atividade> listaAtividades;

}