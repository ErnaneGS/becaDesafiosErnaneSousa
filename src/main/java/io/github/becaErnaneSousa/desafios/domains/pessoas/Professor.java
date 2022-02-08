package io.github.becaErnaneSousa.desafios.domains.pessoas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Pessoa {

    String especialidade;

    @OneToMany
    List<Professor> listaProfessor = new ArrayList<>();

}