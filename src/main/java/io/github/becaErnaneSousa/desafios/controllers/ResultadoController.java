package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.ResultadoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.ResultadoResponse;
import io.github.becaErnaneSousa.desafios.servicesimplements.ResultadoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/resultado")
public class ResultadoController {

    private final ResultadoServiceImpl resultadoService;

    @PostMapping
    public ResponseEntity<ResultadoResponse> criar(@RequestBody @Valid ResultadoRequest resultadoRequest) {
        ResultadoResponse resultadoResponse = resultadoService.criar(resultadoRequest);

        return ResponseEntity.created(null).body(resultadoResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <ResultadoResponse> atualizar(@RequestBody @Valid ResultadoRequest resultadoRequest, @PathVariable Long id) {
        ResultadoResponse resultadoResponse = resultadoService.atualizar(resultadoRequest, id);

        return ResponseEntity.ok(resultadoResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        resultadoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<GetResultadoListarResponse> getResultadoListarResponses = resultadoService.listar();

        return ResponseEntity.ok(getResultadoListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetResultadoObterResponse> obter(@PathVariable Long id) {
        GetResultadoObterResponse getResultadoObterResponse = resultadoService.obter(id);

        return ResponseEntity.ok(getResultadoObterResponse);
    }
}
