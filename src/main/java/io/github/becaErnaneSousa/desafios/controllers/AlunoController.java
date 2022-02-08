package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequestPatch;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.AlunoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoObterResponse;
import io.github.becaErnaneSousa.desafios.servicesimplements.AlunoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoServiceImpl alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponse> criar(@RequestBody @Valid AlunoRequest alunoRequest) {
        AlunoResponse alunoResponse = alunoService.criar(alunoRequest);

        return ResponseEntity.created(null).body(alunoResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity<AlunoResponse> atualizar(@RequestBody @Valid AlunoRequestPatch alunoRequestPatch, @PathVariable Long id) {
        AlunoResponse alunoResponse = alunoService.atualizar(alunoRequestPatch, id);

        return ResponseEntity.ok(alunoResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        alunoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetAlunoListarResponse> getAlunoListarResponses = alunoService.listar();

        return ResponseEntity.ok(getAlunoListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity<GetAlunoObterResponse> obter(@PathVariable Long id) {
        GetAlunoObterResponse getAlunoObterResponse = alunoService.obter(id);

        return ResponseEntity.ok(getAlunoObterResponse);
    }

}