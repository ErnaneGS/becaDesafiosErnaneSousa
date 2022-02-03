package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.*;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServiceImpl {

    @Autowired
    ProfessorRepository professorRepository;

    public ProfessorResponse criar(ProfessorRequest professorRequest) {

        Professor professor = new Professor();
        professor.setNome(professorRequest.getNome());
        professor.setDataNascimento(professorRequest.getDataNascimento());
        professor.setEndereco(professorRequest.getEndereco());
        professor.setTelefone(professorRequest.getTelefone());
        professor.setCpf(professorRequest.getCpf());
        professor.setEspecialidade(professorRequest.getEspecialidade());

        if( professor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (professor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (professor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Professor professorSalvo = professorRepository.save(professor);

        ProfessorResponse professorResponse = new ProfessorResponse();
        professorResponse.setCadastro(professorSalvo.getId());
        professorResponse.setMensagem("Professor " + professorSalvo.getId() + " - " + professorSalvo.getNome() + " criado com sucesso.");

        return professorResponse;

    }

    public ProfessorResponse atualizar(ProfessorRequest professorRequest, Long id) {

        Professor professorObtido = professorRepository.findById(id).get();

        if(professorRequest.getNome() != null) {
            professorObtido.setNome(professorRequest.getNome());
        }

        if(professorRequest.getCpf() != null) {
            professorObtido.setCpf(professorRequest.getCpf());
        }

        if(professorRequest.getEndereco() != null) {
            professorObtido.setEndereco(professorRequest.getEndereco());
        }

        if(professorRequest.getTelefone() != null) {
            professorObtido.setTelefone(professorRequest.getTelefone());
        }

        if(professorRequest.getDataNascimento() != null) {
            professorObtido.setDataNascimento(professorRequest.getDataNascimento());
        }

        if(professorRequest.getEspecialidade() != null) {
            professorObtido.setEspecialidade(professorRequest.getEspecialidade());
        }

        professorRepository.save(professorObtido);

        ProfessorResponse professorResponse = new ProfessorResponse();
        professorResponse.setCadastro(professorObtido.getId());
        professorResponse.setMensagem("Professor " + professorObtido.getId() + " - " + professorObtido.getNome() + " atualizado com sucesso.");


        return professorResponse;
    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);

    }

    public List<GetProfessorListarResponse> listar() {

        List<Professor> listaProfessor = professorRepository.findAll();

        List<GetProfessorListarResponse> getProfessorListarResponses = new ArrayList<>();

        listaProfessor.stream().forEach(professor ->  getProfessorListarResponses.add(new GetProfessorListarResponse(professor)));

        return getProfessorListarResponses;
    }

    public GetProfessorObterResponse obter(Long id) {

        Professor professor = professorRepository.findById(id).get();

        if(professor == null) {
            throw new RuntimeException("Professor não encontrado!");
        }

        GetProfessorObterResponse getProfessorObterResponse = new GetProfessorObterResponse();
        getProfessorObterResponse.setId(professor.getId());
        getProfessorObterResponse.setNome(professor.getNome());
        getProfessorObterResponse.setCpf(professor.getCpf());
        getProfessorObterResponse.setTelefone(professor.getTelefone());
        getProfessorObterResponse.setEndereco(professor.getEndereco());
        getProfessorObterResponse.setDataNascimento(professor.getDataNascimento());
        getProfessorObterResponse.setEspecialidade(professor.getEspecialidade());

        return getProfessorObterResponse;

    }

}