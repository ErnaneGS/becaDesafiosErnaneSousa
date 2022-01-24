package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.administracao.Matricula;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    Matricula matriculaTeste = new Matricula("01012022", true);

    @PostMapping
    public ResponseEntity<Matricula> criar(@RequestBody Matricula matricula) {
        System.out.println(matricula);

        int contadorId = 1;
        contadorId += 1;
        matricula.setIdMatricula(contadorId);

        return ResponseEntity.created(null).body(matricula);

    }

    @PatchMapping("{idMatricula}")
    public ResponseEntity <Matricula> atualizar(@RequestBody Matricula matricula01, @PathVariable int idMatricula) {
        matriculaTeste = matricula01;

        System.out.println("Dados da matricula  " +idMatricula+ " atualizados com sucesso.");

        return ResponseEntity.ok(matriculaTeste);
    }

    @DeleteMapping("{idMatricula}")
    public ResponseEntity <String> deletar(@PathVariable int idMatricula) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Matricula> listaMatriculas = new ArrayList<>();

        listaMatriculas.add(new Matricula());
        listaMatriculas.add(new Matricula("01032021", true));
        listaMatriculas.add(new Matricula("01022021", true));

        return ResponseEntity.ok(
                List.of(listaMatriculas)
        );
    }

    @GetMapping("{idMatricula}")
    public ResponseEntity <Matricula> obter(@PathVariable int idMatricula) {

        return ResponseEntity.ok(matriculaTeste);
    }
}
