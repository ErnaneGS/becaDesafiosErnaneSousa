package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.pessoas.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    Aluno aluno = new Aluno(001l, "Ernane Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Jose");

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        System.out.println(aluno);

        if( aluno.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (aluno.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (aluno.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(aluno);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Aluno> atualizar(@RequestBody Aluno aluno01, @PathVariable long id) {

        Aluno aluno = new Aluno(002l, "Ernane Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose" );

        aluno = aluno01;

        System.out.println("Dados do aluno " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno(003l, "Paulo Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(004l,"João Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(004l,"Maria Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(005l,"Ana Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));

        return ResponseEntity.ok(
                List.of(listaAlunos)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Aluno> obter(@PathVariable long id) {
        return ResponseEntity.ok(aluno);
    }

}
