package io.github.becaErnaneSousa.desafios.entities.pessoas;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Pessoa {

    private String nomePai;

    @OneToMany
    private List<Matricula> listaMatriculas;

    @OneToMany
    private List<Resultado> listaResultados;

    public AlunoRequest converterAlunoMapper(Aluno aluno) {
        AlunoRequest alunoRequest = new AlunoRequest();

        alunoRequest.setNome(aluno.getNome());

        return alunoRequest;
    }

}