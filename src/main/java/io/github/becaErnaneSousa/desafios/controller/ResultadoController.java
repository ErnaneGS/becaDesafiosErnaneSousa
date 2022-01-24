package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.atividades.Resultado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resultado")
public class ResultadoController {

    Resultado resultadoTeste = new Resultado(10.0);

    @PostMapping
    public ResponseEntity<Resultado> criar(@RequestBody Resultado resultado) {
        System.out.println(resultado);

        return ResponseEntity.created(null).body(resultado);

    }

    @PatchMapping("{idResultado}")
    public ResponseEntity <Resultado> atualizar(@RequestBody Resultado resultado01, @PathVariable int idResultado) {
        resultadoTeste = resultado01;

        return ResponseEntity.ok(resultadoTeste);
    }

    @DeleteMapping("{idResultado}")
    public ResponseEntity <String> deletar(@PathVariable int idResultado) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Resultado> listaResultados = new ArrayList<>();

        listaResultados.add(new Resultado(8.0));
        listaResultados.add(new Resultado(15.0));
        listaResultados.add(new Resultado(10.0));

        return ResponseEntity.ok(
                List.of(listaResultados)
        );
    }

    @GetMapping("{idResultado}")
    public ResponseEntity <Resultado> obter(@PathVariable int idResultado) {

        return ResponseEntity.ok(resultadoTeste);
    }
}
