package io.github.becaErnaneSousa.desafios.domains.atividades;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double resultado;

    @OneToOne
    private Atividade atividade;

    @OneToOne
    private Aluno aluno;

}