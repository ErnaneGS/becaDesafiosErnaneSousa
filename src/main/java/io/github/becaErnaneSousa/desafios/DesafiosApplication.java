package io.github.becaErnaneSousa.desafios;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiosApplication.class, args);

	}

}
