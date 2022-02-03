package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetProfessorListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetProfessorObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.ProfessorResponse;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.ProfessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorServiceImpl professorService;

    @PostMapping
    public ResponseEntity<ProfessorResponse> criar(@RequestBody ProfessorRequest professorRequest) {
        ProfessorResponse professorResponse = professorService.criar(professorRequest);

        return ResponseEntity.created(null).body(professorResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <ProfessorResponse> atualizar(@RequestBody ProfessorRequest professorRequest, @PathVariable Long id) {
        ProfessorResponse professorResponse = professorService.atualizar(professorRequest, id);

        return ResponseEntity.ok(professorResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        professorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetProfessorListarResponse> getProfessorListarResponses = professorService.listar();

        return ResponseEntity.ok(getProfessorListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetProfessorObterResponse> obter(@PathVariable Long id) {
        GetProfessorObterResponse getProfessorObterResponse = professorService.obter(id);

        return ResponseEntity.ok(getProfessorObterResponse);
    }
}
