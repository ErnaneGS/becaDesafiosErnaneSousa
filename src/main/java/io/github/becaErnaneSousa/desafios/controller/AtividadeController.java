package io.github.becaErnaneSousa.desafios.controller;
;
import io.github.becaErnaneSousa.desafios.entity.atividades.Atividade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    Atividade atividadeTeste = new Atividade("Atividade de Ingles 01", "Teste do primeiro bimestre", 10.0);

    @PostMapping
    public ResponseEntity<Atividade> criar(@RequestBody Atividade atividade) {
        System.out.println(atividade);

        int contadorId = 1;
        contadorId += 1;
        atividade.setIdAtividade(contadorId);

        return ResponseEntity.created(null).body(atividade);

    }

    @PatchMapping("{idAtividade}")
    public ResponseEntity <Atividade> atualizar(@RequestBody Atividade atividade01, @PathVariable int idAtividade) {
        atividadeTeste = atividade01;

        System.out.println("Dados da atividade  " +idAtividade+ " atualizados com sucesso.");

        return ResponseEntity.ok(atividadeTeste);
    }

    @DeleteMapping("{idAtividade}")
    public ResponseEntity <String> deletar(@PathVariable int idAtividade) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Atividade> ListaAtividades = new ArrayList<>();

        ListaAtividades.add(new Atividade("Atividade de Espanhol 01", "Teste do primeiro bimestre", 10.0));
        ListaAtividades.add(new Atividade("Atividade de Ingles 02", "Teste do segundo bimestre", 10.0));
        ListaAtividades.add(new Atividade("Atividade de Italiano 01", "Teste do primeiro bimestre", 10.0));

        return ResponseEntity.ok(
                List.of(ListaAtividades)
        );
    }

    @GetMapping("{idAtividade}")
    public ResponseEntity <Atividade> obter(@PathVariable int idAtividade) {

        return ResponseEntity.ok(atividadeTeste);
    }
}
