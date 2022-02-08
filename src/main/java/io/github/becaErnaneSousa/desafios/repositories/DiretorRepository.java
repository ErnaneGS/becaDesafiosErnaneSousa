package io.github.becaErnaneSousa.desafios.repositories;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {
}
