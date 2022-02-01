package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.TurmaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaServiceImpl turmaService;

    @PostMapping
    public ResponseEntity<Turma> criar(@RequestBody Turma turma) {
        Turma turmaCriada = turmaService.criar(turma);

        return ResponseEntity.created(null).body(turmaCriada);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Turma> atualizar(@RequestBody Turma turma, @PathVariable Long id) {
        Turma turmaAtualizada = turmaService.atualizar(turma, id);

        return ResponseEntity.ok(turmaAtualizada);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        turmaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<Turma>> listar() {
        List<Turma> listaTurmas = turmaService.listar();

        return ResponseEntity.ok(listaTurmas);
    }

    @GetMapping("{id}")
    public ResponseEntity <Turma> obter(@PathVariable Long id) {
        Turma turmaObtida = turmaService.obter(id);

        return ResponseEntity.ok(turmaObtida);
    }
}