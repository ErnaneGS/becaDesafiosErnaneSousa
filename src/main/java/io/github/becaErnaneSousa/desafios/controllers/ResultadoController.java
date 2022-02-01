package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.ResultadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/resultado")
public class ResultadoController {

    @Autowired
    private ResultadoServiceImpl resultadoService;

    @PostMapping
    public ResponseEntity<Resultado> criar(@RequestBody Resultado resultado) {
        Resultado resultadoCriado = resultadoService.criar(resultado);

        return ResponseEntity.created(null).body(resultadoCriado);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Resultado> atualizar(@RequestBody Resultado resultado, @PathVariable Long id) {
        Resultado resultadoAtualizado = resultadoService.atualizar(resultado, id);

        return ResponseEntity.ok(resultadoAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        resultadoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<Resultado>> listar() {
        List<Resultado> listaResultados = resultadoService.listar();

        return ResponseEntity.ok(listaResultados);
    }

    @GetMapping("{id}")
    public ResponseEntity <Resultado> obter(@PathVariable Long id) {
        Resultado resultadoObtido = resultadoService.obter(id);

        return ResponseEntity.ok(resultadoObtido);
    }
}
