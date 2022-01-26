package io.github.becaErnaneSousa.desafios.controllers;
;
import io.github.becaErnaneSousa.desafios.entitys.atividades.Atividade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    Atividade atividadeTeste = new Atividade(001l,"Atividade de Ingles 01", "Teste do primeiro bimestre", 10.0);

    @PostMapping
    public ResponseEntity<Atividade> criar(@RequestBody Atividade atividade) {
        System.out.println(atividade);

        return ResponseEntity.created(null).body(atividade);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Atividade> atualizar(@RequestBody Atividade atividade01, @PathVariable long id) {
        atividadeTeste = atividade01;

        System.out.println("Dados da atividade  " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(atividadeTeste);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {

        List<Atividade> ListaAtividades = new ArrayList<>();

        ListaAtividades.add(new Atividade(003l,"Atividade de Espanhol 01", "Teste do primeiro bimestre", 10.0));
        ListaAtividades.add(new Atividade(004l,"Atividade de Ingles 02", "Teste do segundo bimestre", 10.0));
        ListaAtividades.add(new Atividade(005l,"Atividade de Italiano 01", "Teste do primeiro bimestre", 10.0));

        return ResponseEntity.ok(
                List.of(ListaAtividades)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Atividade> obter(@PathVariable long id) {

        return ResponseEntity.ok(atividadeTeste);
    }
}
