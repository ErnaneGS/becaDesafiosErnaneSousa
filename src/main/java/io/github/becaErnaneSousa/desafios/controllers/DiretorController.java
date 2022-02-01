package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.DiretorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    @Autowired
    private DiretorServiceImpl diretorService;

    @PostMapping
    public ResponseEntity<Diretor> criar(@RequestBody Diretor diretor) {
        Diretor diretorCriado = diretorService.criar(diretor);

        return ResponseEntity.created(null).body(diretorCriado);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Diretor> atualizar(@RequestBody Diretor diretor, @PathVariable Long id) {
        Diretor diretorAtualizado = diretorService.atualizar(diretor, id);

        return ResponseEntity.ok(diretorAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        diretorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Diretor>> listar() {
        List<Diretor> listaDiretor = diretorService.listar();

        return ResponseEntity.ok(listaDiretor);
    }

    @GetMapping("{id}")
    public ResponseEntity <Diretor> obter(@PathVariable Long id) {
        Diretor driretorObtido = diretorService.obter(id);

        return ResponseEntity.ok(driretorObtido);
    }
}
