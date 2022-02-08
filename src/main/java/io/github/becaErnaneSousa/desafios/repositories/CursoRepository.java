package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
