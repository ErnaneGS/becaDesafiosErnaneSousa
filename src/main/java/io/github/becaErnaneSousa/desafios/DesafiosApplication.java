package io.github.becaErnaneSousa.desafios;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiosApplication.class, args);


		Diretor diretor = new Diretor(001, "Ernane Geraldo de Sousa",
				"14285634660", "Rua Cativo, 36 Sousa, Rio Manso",
				"31 995182764", "08011999");

		Curso curso01 = new Curso(01, "Ingles", "curso de ingles", 20);
		Curso curso02 = new Curso(01, "Espanhol", "curso de ingles", 20);
		Curso curso03 = new Curso(01, "Italiano", "curso de ingles", 20);

		List<Curso> listaCursos = new ArrayList<>();
		listaCursos.add(curso01);
		listaCursos.add(curso02);
		listaCursos.add(curso03);


		Escola escola = new Escola();
		escola.setId(1);
		escola.setNome("Futura Informática");
		escola.setEndereco("Centro Rio Manso");
		escola.setCnpj("00000000000000");
		escola.setDiretor(diretor);
		escola.setListaCursos(listaCursos);

		System.out.println(escola.toString());
	}

}
