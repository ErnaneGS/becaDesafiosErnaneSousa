package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.administracao.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    Curso cursoTeste = new Curso("Ingles", "Curso de ingles avançado", 220.0);

    @PostMapping
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        System.out.println(curso);

        int contadorId = 1;
        contadorId += 1;
        curso.setIdCurso(contadorId);

        return ResponseEntity.created(null).body(curso);

    }

    @PatchMapping("{idCurso}")
    public ResponseEntity <Curso> atualizar(@RequestBody Curso curso01, @PathVariable int idCurso) {
        cursoTeste = curso01;

        System.out.println("Dados do curso " +idCurso+ " atualizados com sucesso.");

        return ResponseEntity.ok(cursoTeste);
    }

    @DeleteMapping("{idCurso}")
    public ResponseEntity <String> deletar(@PathVariable int idCurso) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(new Curso("Espanhol", "Espanhol avançado", 220.0));
        listaCursos.add(new Curso("Ingles", "Ingles avançado", 220.0));
        listaCursos.add(new Curso("Italiano", "Italiano avançado", 220.0));

        return ResponseEntity.ok(
                List.of(listaCursos)
        );
    }

    @GetMapping("{idCurso}")
    public ResponseEntity <Curso> obter(@PathVariable int idCurso) {

        return ResponseEntity.ok(cursoTeste);
    }

}