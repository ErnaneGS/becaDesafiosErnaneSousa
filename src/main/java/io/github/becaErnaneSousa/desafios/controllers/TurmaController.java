package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.administracao.Turma;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    Turma turmaTeste = new Turma(001l,"Turma de Ingles", 20, "01022022", "01022023", true);

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        System.out.println(turma);

        return ResponseEntity.created(null).body(turma);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Turma> atualizar(@RequestBody Turma turma01, @PathVariable long id) {
        turmaTeste = turma01;

        System.out.println("Dados da turma  " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(turmaTeste);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Turma> listaTurmas = new ArrayList<>();

        listaTurmas.add(new Turma(002l,"Turma de Espanhol", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma(003l,"Turma de Ingles 02", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma(004l,"Turma de Italiano", 20, "01022022", "01022023", true));

        return ResponseEntity.ok(
                List.of(listaTurmas)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Turma> obter(@PathVariable long id) {

        return ResponseEntity.ok(turmaTeste);
    }

}