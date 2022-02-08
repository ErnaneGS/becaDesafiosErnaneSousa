package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.AtividadeRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.AtividadeResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeObterResponse;
import io.github.becaErnaneSousa.desafios.servicesimplements.AtividadeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    private final AtividadeServiceImpl atividadeService;

    @PostMapping
    public ResponseEntity<AtividadeResponse> criar(@RequestBody  @Valid AtividadeRequest atividadeRequest) {
        AtividadeResponse atividadeResponse = atividadeService.criar(atividadeRequest);

        return ResponseEntity.created(null).body(atividadeResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <AtividadeResponse> atualizar(@RequestBody @Valid AtividadeRequest atividadeRequest, @PathVariable Long id) {
        AtividadeResponse atividadeResponse = atividadeService.atualizar(atividadeRequest, id);

        return ResponseEntity.ok(atividadeResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        atividadeService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List<GetAtividadeListarResponse>> listar() {
        List<GetAtividadeListarResponse> getAtividadeListarResponses = atividadeService.listar();

        return ResponseEntity.ok(getAtividadeListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetAtividadeObterResponse> obter(@PathVariable Long id) {
        GetAtividadeObterResponse getAtividadeObterResponse = atividadeService.obter(id);

        return ResponseEntity.ok(getAtividadeObterResponse);
    }
}
