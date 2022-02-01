package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
}
