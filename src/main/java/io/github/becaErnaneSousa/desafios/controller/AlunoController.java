package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.pessoas.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    Aluno aluno = new Aluno("Ernane Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Jose");


    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        System.out.println(aluno);

        int contadorId = 1;
        contadorId += 1;
        aluno.setId(contadorId);

        if( aluno.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (aluno.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (aluno.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(aluno);

    }

    @PatchMapping("{idAluno}")
    public ResponseEntity <Aluno> atualizar(@RequestBody Aluno aluno01, @PathVariable int idAluno) {

        Aluno aluno = new Aluno("Ernane Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose" );

        aluno = aluno01;

        System.out.println("Dados do aluno " +idAluno+ " atualizados com sucesso.");

        return ResponseEntity.ok(aluno);
    }

    @DeleteMapping("{idAluno}")
    public ResponseEntity <String> deletar(@PathVariable int idAluno) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno("Paulo Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno("João Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno("Maria Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno("Ana Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));

        return ResponseEntity.ok(
                List.of(listaAlunos)
        );
    }

    @GetMapping("{idAluno}")
    public ResponseEntity <Aluno> obter(@PathVariable int idAluno) {
        return ResponseEntity.ok(aluno);
    }

}
