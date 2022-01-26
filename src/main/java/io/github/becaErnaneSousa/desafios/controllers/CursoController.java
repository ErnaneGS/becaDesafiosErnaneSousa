package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.administracao.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    Curso cursoTeste = new Curso(001l, "Ingles", "Curso de ingles avançado", 220.0);

    @PostMapping
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        System.out.println(curso);

        return ResponseEntity.created(null).body(curso);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Curso> atualizar(@RequestBody Curso curso01, @PathVariable long id) {
        cursoTeste = curso01;

        System.out.println("Dados do curso " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(cursoTeste);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(new Curso(002l,"Espanhol", "Espanhol avançado", 220.0));
        listaCursos.add(new Curso(003l,"Ingles", "Ingles avançado", 220.0));
        listaCursos.add(new Curso(004l,"Italiano", "Italiano avançado", 220.0));

        return ResponseEntity.ok(
                List.of(listaCursos)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Curso> obter(@PathVariable long id) {

        return ResponseEntity.ok(cursoTeste);
    }

}