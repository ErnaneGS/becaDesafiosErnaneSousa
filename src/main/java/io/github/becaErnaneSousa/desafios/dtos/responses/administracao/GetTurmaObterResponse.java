package io.github.becaErnaneSousa.desafios.dtos.responses.administracao;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTurmaObterResponse {

    private String nome;
    private int quantidadeAluno;
    private Date dataInicio;
    private Date dataFim;
    private boolean status;
    private Professor professor;
    private List<Matricula> listaMatriculas;
    private List<Atividade> listaAtividades;

}
