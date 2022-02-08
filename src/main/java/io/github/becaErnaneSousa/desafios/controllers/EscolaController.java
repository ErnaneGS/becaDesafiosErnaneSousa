package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.EscolaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.EscolaResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaObterResponse;
import io.github.becaErnaneSousa.desafios.servicesimplements.EscolaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/escola")
public class EscolaController {

    private final EscolaServiceImpl escolaService;

    @PostMapping
    public ResponseEntity <EscolaResponse> criar(@RequestBody @Valid EscolaRequest escolaRequest) {
        EscolaResponse escolaReponse = escolaService.criar(escolaRequest);

        return ResponseEntity.created(null).body(escolaReponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <EscolaResponse> atualizar(@RequestBody @Valid EscolaRequest escolaRequest, @PathVariable Long id) {
       EscolaResponse escolaReponse = escolaService.atualizar(escolaRequest, id);

       return ResponseEntity.ok(escolaReponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        escolaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetEscolaListarResponse> getEscolaListarResponses = escolaService.listar();

        return ResponseEntity.ok(getEscolaListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetEscolaObterResponse> obter(@PathVariable Long id) {
        GetEscolaObterResponse getEscolaObterResponse = escolaService.obter(id);

        return ResponseEntity.ok(getEscolaObterResponse);
    }

}