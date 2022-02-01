package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno alunoCriado = alunoService.criar(aluno);

        return ResponseEntity.created(null).body(alunoCriado);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Aluno> atualizar(@RequestBody Aluno aluno, @PathVariable long id) {
        Aluno alunoAtualizado = alunoService.atualizar(aluno, id);

        return ResponseEntity.ok(alunoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        alunoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Aluno> listaAlunos = alunoService.listar();

        return ResponseEntity.ok(listaAlunos);
    }

    @GetMapping("{id}")
    public ResponseEntity <Aluno> obter(@PathVariable long id) {
        Aluno alunoObtido = alunoService.obter(id);

        return ResponseEntity.ok(alunoObtido);
    }

}
