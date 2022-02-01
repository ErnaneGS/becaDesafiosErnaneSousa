package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
