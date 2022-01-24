package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.administracao.Turma;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    Turma turmaTeste = new Turma("Turma de Ingles", 20, "01022022", "01022023", true);

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        System.out.println(turma);

        int contadorId = 1;
        contadorId += 1;
        turma.setIdTurma(contadorId);

        return ResponseEntity.created(null).body(turma);

    }

    @PatchMapping("{idTurma}")
    public ResponseEntity <Turma> atualizar(@RequestBody Turma turma01, @PathVariable int idTurma) {
        turmaTeste = turma01;

        System.out.println("Dados da turma  " +idTurma+ " atualizados com sucesso.");

        return ResponseEntity.ok(turmaTeste);
    }

    @DeleteMapping("{idTurma}")
    public ResponseEntity <String> deletar(@PathVariable int idTurma) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Turma> listaTurmas = new ArrayList<>();

        listaTurmas.add(new Turma("Turma de Espanhol", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma("Turma de Ingles 02", 20, "01022022", "01022023", true));
        listaTurmas.add(new Turma("Turma de Italiano", 20, "01022022", "01022023", true));

        return ResponseEntity.ok(
                List.of(listaTurmas)
        );
    }

    @GetMapping("{idTurma}")
    public ResponseEntity <Turma> obter(@PathVariable int idTurma) {

        return ResponseEntity.ok(turmaTeste);
    }

}