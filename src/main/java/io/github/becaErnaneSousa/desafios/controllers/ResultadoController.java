package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.atividades.Resultado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resultado")
public class ResultadoController {

    Resultado resultadoTeste = new Resultado(001l,10.0);

    @PostMapping
    public ResponseEntity<Resultado> criar(@RequestBody Resultado resultado) {
        System.out.println(resultado);

        return ResponseEntity.created(null).body(resultado);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Resultado> atualizar(@RequestBody Resultado resultado01, @PathVariable long id) {
        resultadoTeste = resultado01;

        return ResponseEntity.ok(resultadoTeste);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Resultado> listaResultados = new ArrayList<>();

        listaResultados.add(new Resultado(002l,8.0));
        listaResultados.add(new Resultado(003l,15.0));
        listaResultados.add(new Resultado(004l,10.0));

        return ResponseEntity.ok(
                List.of(listaResultados)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Resultado> obter(@PathVariable long id) {

        return ResponseEntity.ok(resultadoTeste);
    }
}
