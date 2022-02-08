package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.MatriculaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetMatriculaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetMatriculaObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.MatriculaResponse;
import io.github.becaErnaneSousa.desafios.servicesimplements.MatriculaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    private final MatriculaServiceImpl matriculaService;

    @PostMapping
    public ResponseEntity<MatriculaResponse> criar(@RequestBody @Valid MatriculaRequest matriculaRequest) {
        MatriculaResponse matriculaResponse = matriculaService.criar(matriculaRequest);

        return ResponseEntity.created(null).body(matriculaResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <MatriculaResponse> atualizar(@RequestBody @Valid MatriculaRequest matriculaRequest, @PathVariable Long id) {
      MatriculaResponse matriculaResponse = matriculaService.atualizar(matriculaRequest, id);

      return ResponseEntity.ok(matriculaResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        matriculaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetMatriculaListarResponse> getMatriculaListarResponses = matriculaService.listar();

        return ResponseEntity.ok(getMatriculaListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetMatriculaObterResponse> obter(@PathVariable Long id) {
        GetMatriculaObterResponse getMatriculaObterResponse = matriculaService.obter(id);

        return ResponseEntity.ok(getMatriculaObterResponse);
    }
}
