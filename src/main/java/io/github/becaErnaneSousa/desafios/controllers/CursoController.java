package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.CursoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoServiceImpl cursoService;

    @PostMapping
    public ResponseEntity<Curso> criar(@RequestBody Curso curso) {
        Curso cursoCriado = cursoService.criar(curso);

        return ResponseEntity.created(null).body(cursoCriado);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Curso> atualizar(@RequestBody Curso curso, @PathVariable long id) {
        Curso cursoAtualizado = cursoService.atualizar(curso, id);

        return ResponseEntity.ok(cursoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        cursoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<Curso>> listar() {
        List<Curso> listaCursos =cursoService.listar();

        return ResponseEntity.ok(listaCursos);
    }

    @GetMapping("{id}")
    public ResponseEntity <Curso> obter(@PathVariable long id) {
        Curso cursoObtido = cursoService.obter(id);

        return ResponseEntity.ok(cursoObtido);
    }

}