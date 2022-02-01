package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
