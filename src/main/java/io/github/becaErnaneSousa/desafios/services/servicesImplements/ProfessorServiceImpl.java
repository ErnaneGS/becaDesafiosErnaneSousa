package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.repositories.ProfessorRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfessorServiceImpl implements ServiceInterface<Professor> {

    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public Professor criar(Professor professor) {

        if( professor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (professor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (professor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Professor professorSalvo = professorRepository.save(professor);

        return professorSalvo;

    }

    @Override
    public Professor atualizar(Professor professor,  Long id) {

        Professor professorObtido = this.obter(id);
        professorObtido.setNome(professor.getNome());
        professorObtido.setCpf(professor.getCpf());
        professorObtido.setEndereco(professor.getEndereco());
        professorObtido.setTelefone(professor.getTelefone());
        professorObtido.setDataNascimento(professor.getDataNascimento());
        professorObtido.setEspecialidade(professor.getEspecialidade());

        professorRepository.save(professorObtido);

        return professor;
    }

    @Override
    public void deletar(Long id) {
        professorRepository.deleteById(id);

    }

    @Override
    public List<Professor> listar() {

        List<Professor> listaProfessor = professorRepository.findAll();


        return listaProfessor;
    }

    @Override
    public Professor obter(Long id) {

        Professor professor = professorRepository.findById(id).get();

        return professor;

    }

}
