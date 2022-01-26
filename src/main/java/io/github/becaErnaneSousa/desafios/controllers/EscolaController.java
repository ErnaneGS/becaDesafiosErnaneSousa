package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.administracao.Escola;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolaController {

    Escola escola = new Escola(11, "Escola Rio MAnso", "Rio Manso", "00000000000001");

    @PostMapping
    public ResponseEntity <Escola> criar(@RequestBody Escola escola) {
        System.out.println(escola);

       if( escola.getCnpj().length() == 14 ) {
           return ResponseEntity.created(null).body(escola);
        } else {
           return ResponseEntity.unprocessableEntity().build();
       }

    }

    @PatchMapping("{id}")
    public ResponseEntity <Escola> atualizar(@RequestBody Escola escola01, @PathVariable long id) {
        escola = escola01;

        System.out.println("Dados da escola " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(escola);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        return ResponseEntity.ok(
                List.of(
                escola)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Escola> obter(@PathVariable long id) {

        return ResponseEntity.ok(escola);
    }

}