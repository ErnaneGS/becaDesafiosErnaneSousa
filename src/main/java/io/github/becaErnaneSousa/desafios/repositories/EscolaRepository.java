package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
