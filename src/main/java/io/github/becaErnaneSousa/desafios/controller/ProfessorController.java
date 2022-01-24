package io.github.becaErnaneSousa.desafios.controller;

import io.github.becaErnaneSousa.desafios.entity.pessoas.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    Professor professorTeste = new Professor("Davi Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Ingles");

    @PostMapping
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        System.out.println(professor);

        int contadorId = 1;
        contadorId += 1;
        professor.setId(contadorId);

        if( professor.getCpf().length() != 11 ) {
            return ResponseEntity.unprocessableEntity().build();
        } else if (professor.getDataNascimento().length() != 8){
            return ResponseEntity.unprocessableEntity().build();
        } else if (professor.getTelefone().length() != 11) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.created(null).body(professor);

    }

    @PatchMapping("{idProfessor}")
    public ResponseEntity <Professor> atualizar(@RequestBody Professor professor01, @PathVariable int idProfessor) {

        Professor professor = new Professor("Gabriel Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Espanhol" );

        professor = professor01;

        System.out.println("Dados do aluno " +idProfessor+ " atualizados com sucesso.");

        return ResponseEntity.ok(professor);
    }

    @DeleteMapping("{idProfessor}")
    public ResponseEntity <String> deletar(@PathVariable int idProfessor) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity <List> listar() {
        List<Professor> listaProfessor = new ArrayList<>();

        listaProfessor.add(new Professor("Isamel Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Ingles"));
        listaProfessor.add(new Professor("Lilian Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Japones"));
        listaProfessor.add(new Professor("David Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Alemao"));

        return ResponseEntity.ok(
                List.of(listaProfessor)
        );
    }

    @GetMapping("{idProfessor}")
    public ResponseEntity <Professor> obter(@PathVariable int idProfessor) {
        return ResponseEntity.ok(professorTeste);
    }
}
