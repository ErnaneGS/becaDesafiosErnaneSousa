package io.github.becaErnaneSousa.desafios.domains.pessoas;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
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

}