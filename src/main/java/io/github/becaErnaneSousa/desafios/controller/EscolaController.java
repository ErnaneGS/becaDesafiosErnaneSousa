package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.administracao.Escola;
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

    @PatchMapping("{idEscola}")
    public ResponseEntity <Escola> atualizar(@RequestBody Escola escola01, @PathVariable int idEscola) {
        escola = escola01;

        System.out.println("Dados da escola " +idEscola+ " atualizados com sucesso.");

        return ResponseEntity.ok(escola);
    }

    @DeleteMapping("{idEscola}")
    public ResponseEntity <String> deletar(@PathVariable int idEscola) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {


        return ResponseEntity.ok(
                List.of(
                escola)
        );
    }

    @GetMapping("{idEscola}")
    public ResponseEntity <Escola> obter(@PathVariable int idescola) {

        return ResponseEntity.ok(escola);
    }

}