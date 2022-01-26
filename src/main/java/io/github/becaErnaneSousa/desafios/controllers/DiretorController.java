package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.pessoas.Diretor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    Diretor diretor = new Diretor(001l,"Carlos Eduardo", "14285634666", "Sousa", "31 995182764", "08011999");

    @PostMapping
    public ResponseEntity<Diretor> criar(@RequestBody Diretor diretor) {
        System.out.println(diretor);

        if( diretor.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (diretor.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (diretor.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(diretor);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Diretor> atualizar(@RequestBody Diretor diretor01, @PathVariable long id) {
        diretor = diretor01;

        System.out.println("Dados do diretor " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(diretor01);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        return ResponseEntity.ok(
                List.of(diretor)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Diretor> obter(@PathVariable long id) {
        return ResponseEntity.ok(diretor);
    }
}
