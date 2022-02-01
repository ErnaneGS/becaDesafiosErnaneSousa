package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
