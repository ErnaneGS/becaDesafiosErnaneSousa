package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ProfessorInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorInterface {

    Professor professor = new Professor(001l,"Davi Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Ingles");

    @Override
    public Professor criar(Professor professor) {
        System.out.println(professor);


        if( professor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (professor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (professor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }
        return professor;

    }

    @Override
    public Professor atualizar(Professor professor01,  long id) {

        professor = professor01;

        return professor;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Professor> listar() {
        List<Professor> listaProfessor = new ArrayList<>();

        listaProfessor.add(new Professor(003l,"Isamel Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Ingles"));
        listaProfessor.add(new Professor(006l,"Lilian Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Japones"));
        listaProfessor.add(new Professor(005l,"David Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Alemao"));

        return listaProfessor;
    }

    @Override
    public Professor obter(long id) {
        return professor;
    }

}
