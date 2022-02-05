package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.servicesimplements.MatriculaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    private final MatriculaServiceImpl matriculaService;

    @PostMapping
    public ResponseEntity<Matricula> criar(@RequestBody @Valid Matricula matricula) {
        Matricula matriculaCriada = matriculaService.criar(matricula);

        return ResponseEntity.created(null).body(matriculaCriada);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Matricula> atualizar(@RequestBody @Valid Matricula matricula, @PathVariable Long id) {
      Matricula matriculaAtualizada = matriculaService.atualizar(matricula, id);

      return ResponseEntity.ok(matriculaAtualizada);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        matriculaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Matricula> listaMatriculas = matriculaService.listar();

        return ResponseEntity.ok(listaMatriculas);
    }

    @GetMapping("{id}")
    public ResponseEntity <Matricula> obter(@PathVariable Long id) {
        Matricula matriculaObtida = matriculaService.obter(id);

        return ResponseEntity.ok(matriculaObtida);
    }
}
