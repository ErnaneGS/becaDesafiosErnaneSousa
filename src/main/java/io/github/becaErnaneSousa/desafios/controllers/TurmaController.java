package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.TurmaResponse;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.TurmaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaServiceImpl turmaService;

    @PostMapping
    public ResponseEntity<TurmaResponse> criar(@RequestBody TurmaRequest turmaRequest) {
        TurmaResponse turmaResponse = turmaService.criar(turmaRequest);

        return ResponseEntity.created(null).body(turmaResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <TurmaResponse> atualizar(@RequestBody TurmaRequest turmaRequest, @PathVariable Long id) {
        TurmaResponse turmaResponse = turmaService.atualizar(turmaRequest, id);

        return ResponseEntity.ok(turmaResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        turmaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetTurmaListarResponse> getTurmaListarResponses = turmaService.listar();

        return ResponseEntity.ok(getTurmaListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity<GetTurmaObterResponse> obter(@PathVariable Long id) {
        GetTurmaObterResponse getTurmaObterResponse = turmaService.obter(id);

        return ResponseEntity.ok(getTurmaObterResponse);
    }
}