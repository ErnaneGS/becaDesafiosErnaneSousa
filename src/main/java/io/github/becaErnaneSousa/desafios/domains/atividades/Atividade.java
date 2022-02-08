package io.github.becaErnaneSousa.desafios.domains.atividades;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double nota;

    @OneToOne
    private Turma turma;

    @OneToMany
    private List<Resultado> listaResultados;

}