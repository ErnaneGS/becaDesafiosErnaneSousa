package io.github.becaErnaneSousa.desafios.controllers;

import io.github.becaErnaneSousa.desafios.entitys.pessoas.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    Professor professorTeste = new Professor(001l,"Davi Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Ingles");

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        System.out.println(professor);

        if( professor.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (professor.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (professor.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(professor);

    }

    @PatchMapping("{id}")
    public ResponseEntity <Professor> atualizar(@RequestBody Professor professor01, @PathVariable long id) {

        Professor professor = new Professor(002l,"Gabriel Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Espanhol" );

        professor = professor01;

        System.out.println("Dados do aluno " +id+ " atualizados com sucesso.");

        return ResponseEntity.ok(professor);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <String> deletar(@PathVariable long id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Professor> listaProfessor = new ArrayList<>();

        listaProfessor.add(new Professor(003l,"Isamel Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Ingles"));
        listaProfessor.add(new Professor(006l,"Lilian Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Japones"));
        listaProfessor.add(new Professor(005l,"David Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Alemao"));

        return ResponseEntity.ok(
                List.of(listaProfessor)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity <Professor> obter(@PathVariable long id) {
        return ResponseEntity.ok(professorTeste);
    }
}
