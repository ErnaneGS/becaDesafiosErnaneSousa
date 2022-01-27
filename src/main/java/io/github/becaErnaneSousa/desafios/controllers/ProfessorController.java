package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.ProfessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorServiceImpl professorService;

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        Professor professorCriado = professorService.criar(professor);

        return ResponseEntity.created(null).body(professorCriado);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Professor> atualizar(@RequestBody Professor professor, @PathVariable long id) {
        Professor professorAtualizado = professorService.atualizar(professor, id);

        return ResponseEntity.ok(professorAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        professorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Professor> listaProfessores = professorService.listar();

        return ResponseEntity.ok(listaProfessores);
    }

    @GetMapping("{id}")
    public ResponseEntity <Professor> obter(@PathVariable long id) {
        Professor professorObtido = professorService.obter(id);

        return ResponseEntity.ok(professorObtido);
    }
}
