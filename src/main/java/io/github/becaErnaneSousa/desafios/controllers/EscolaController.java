package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.EscolaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolaController {

    @Autowired
    private EscolaServiceImpl escolaService;

    @PostMapping
    public ResponseEntity <Escola> criar(@RequestBody Escola escola) {
        Escola escolaCriada = escolaService.criar(escola);

        return ResponseEntity.created(null).body(escolaCriada);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Escola> atualizar(@RequestBody Escola escola, @PathVariable long id) {
       Escola escolaAtualizada = escolaService.atualizar(escola, id);

       return ResponseEntity.ok(escolaAtualizada);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        escolaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<Escola>> listar() {
        List<Escola> listaEscola = escolaService.listar();

        return ResponseEntity.ok(listaEscola);
    }

    @GetMapping("{id}")
    public ResponseEntity <Escola> obter(@PathVariable long id) {
        Escola escolaObtida = escolaService.obter(id);

        return ResponseEntity.ok(escolaObtida);
    }

}