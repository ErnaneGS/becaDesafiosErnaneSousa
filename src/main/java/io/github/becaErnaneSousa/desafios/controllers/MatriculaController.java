package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.administracao.Matricula;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    Matricula matriculaTeste = new Matricula(001l, "01012022", true);

    @PostMapping
    public ResponseEntity<Matricula> criar(@RequestBody Matricula matricula) {
        System.out.println(matricula);

        return ResponseEntity.created(null).body(matricula);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Matricula> atualizar(@RequestBody Matricula matricula01, @PathVariable long id) {
        matriculaTeste = matricula01;

        System.out.println("Dados da matricula  " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(matriculaTeste);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Matricula> listaMatriculas = new ArrayList<>();

        listaMatriculas.add(new Matricula());
        listaMatriculas.add(new Matricula(002l,"01032021", true));
        listaMatriculas.add(new Matricula(003l,"01022021", true));

        return ResponseEntity.ok(
                List.of(listaMatriculas)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Matricula> obter(@PathVariable long id) {

        return ResponseEntity.ok(matriculaTeste);
    }
}
