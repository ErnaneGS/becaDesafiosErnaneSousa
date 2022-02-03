package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.AlunoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoObterResponse;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponse> criar(@RequestBody AlunoRequest alunoRequest) {
        AlunoResponse alunoResponse = alunoService.criar(alunoRequest);

        return ResponseEntity.created(null).body(alunoResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <AlunoResponse> atualizar(@RequestBody AlunoRequest alunoRequest, @PathVariable Long id) {
        AlunoResponse alunoResponse = alunoService.atualizar(alunoRequest, id);

        return ResponseEntity.ok(alunoResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        alunoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetAlunoListarResponse> getAlunoListarResponses = alunoService.listar();

        return ResponseEntity.ok(getAlunoListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetAlunoObterResponse> obter(@PathVariable Long id) {
        GetAlunoObterResponse getAlunoObterResponse = alunoService.obter(id);

        return ResponseEntity.ok(getAlunoObterResponse);
    }

}