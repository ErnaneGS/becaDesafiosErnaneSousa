package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.pessoas.Diretor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    Diretor diretor = new Diretor("Carlos Eduardo", "14285634666", "Sousa", "31 995182764", "08011999");

    @PostMapping
    public ResponseEntity<Diretor> criar(@RequestBody Diretor diretor) {
        System.out.println(diretor);

        int contadorId = 1;
        contadorId += 1;
        diretor.setId(contadorId);

        if( diretor.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (diretor.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (diretor.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(diretor);

    }

    @PatchMapping("{idDiretor}")
    public ResponseEntity <Diretor> atualizar(@RequestBody Diretor diretor01, @PathVariable int idDiretor) {
        diretor = diretor01;

        System.out.println("Dados do diretor " +idDiretor+ " atualizados com sucesso.");

        return ResponseEntity.ok(diretor01);
    }

    @DeleteMapping("{idDiretor}")
    public ResponseEntity <String> deletar(@PathVariable int idDiretor) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        return ResponseEntity.ok(
                List.of(diretor)
        );
    }

    @GetMapping("{idEscola}")
    public ResponseEntity <Diretor> obter(@PathVariable int idescola) {
        return ResponseEntity.ok(diretor);
    }
}
