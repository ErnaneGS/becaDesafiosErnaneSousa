package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.CursoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoObterResponse;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.CursoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoServiceImpl cursoService;

    @PostMapping
    public ResponseEntity<CursoResponse> criar(@RequestBody CursoRequest cursoRequest) {
        CursoResponse cursoResponse = cursoService.criar(cursoRequest);

        return ResponseEntity.created(null).body(cursoResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <CursoResponse> atualizar(@RequestBody CursoRequest cursoRequest, @PathVariable Long id) {
        CursoResponse cursoResponse = cursoService.atualizar(cursoRequest, id);

        return ResponseEntity.ok(cursoResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        cursoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {
        List<GetCursoListarResponse> getCursoListarResponses =cursoService.listar();

        return ResponseEntity.ok(getCursoListarResponses);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetCursoObterResponse> obter(@PathVariable Long id) {
        GetCursoObterResponse getCursoObterResponse = cursoService.obter(id);

        return ResponseEntity.ok(getCursoObterResponse);
    }

}