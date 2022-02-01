package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.AtividadeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    private AtividadeServiceImpl atividadeService;

    @PostMapping
    public ResponseEntity<Atividade> criar(@RequestBody Atividade atividade) {
        Atividade atividadeCriada = atividadeService.criar(atividade);

        return ResponseEntity.created(null).body(atividadeCriada);
    }

    @PatchMapping("{id}")
    public ResponseEntity <Atividade> atualizar(@RequestBody Atividade atividade, @PathVariable Long id) {
        Atividade atividadeAtualizada = atividadeService.atualizar(atividade, id);

        return ResponseEntity.ok(atividadeAtualizada);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        atividadeService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<Atividade>> listar() {
        List<Atividade> listaAtividades = atividadeService.listar();

        return ResponseEntity.ok(listaAtividades);
    }

    @GetMapping("{id}")
    public ResponseEntity <Atividade> obter(@PathVariable Long id) {
        Atividade atividadeObtida = atividadeService.obter(id);

        return ResponseEntity.ok(atividadeObtida);
    }
}
