package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.*;
import io.github.becaErnaneSousa.desafios.services.servicesImplements.DiretorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    @Autowired
    private DiretorServiceImpl diretorService;

    @PostMapping
    public ResponseEntity<DiretorResponse> criar(@RequestBody DiretorRequest diretorRequest) {
        DiretorResponse diretorResponse = diretorService.criar(diretorRequest);

        return ResponseEntity.created(null).body(diretorResponse);
    }

    @PatchMapping("{id}")
    public ResponseEntity <DiretorResponse> atualizar(@RequestBody DiretorRequest diretorRequest, @PathVariable Long id) {
        DiretorResponse diretorResponse = diretorService.atualizar(diretorRequest, id);

        return ResponseEntity.ok(diretorResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable Long id) {
        diretorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {

        List<GetDiretorListarResponse> getDiretorListarResponse = diretorService.listar();

        return ResponseEntity.ok(getDiretorListarResponse);
    }

    @GetMapping("{id}")
    public ResponseEntity <GetDiretorObterResponse> obter(@PathVariable Long id) {
        GetDiretorObterResponse getDiretorObterResponse = diretorService.obter(id);

        return ResponseEntity.ok(getDiretorObterResponse);
    }
}
