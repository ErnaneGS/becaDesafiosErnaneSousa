package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequestPatch;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.*;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl {

    private final ProfessorRepository professorRepository;
    private final MapperProfessorRequestToProfessor mapperProfessorRequestToProfessor;
    private final MapperProfessorToProfessorResponse mapperProfessorToProfessorResponse;
    private final MapperProfessorAtualizar mapperProfessorAtualizar;
    private final MapperProfessorToProfessorListarResponse mapperProfessorToProfessorListarResponse;
    private final MapperProfessorToProfessorObterResponse mapperProfessorToProfessorObterResponse;

    public ProfessorResponse criar(ProfessorRequest professorRequest) {

        Professor professor = mapperProfessorRequestToProfessor.toMOdel(professorRequest);

        professorRepository.save(professor);

        ProfessorResponse professorResponse = mapperProfessorToProfessorResponse.toResponse(professor);

        professorResponse.setMensagem("Professor cadastrado com sucesso!");

        return professorResponse;

    }

    public ProfessorResponse atualizar(ProfessorRequestPatch professorRequestPatch, Long id) {

        Professor professor = professorRepository.findById(id).get();

        mapperProfessorAtualizar.atualizar(professorRequestPatch, professor);

        professorRepository.save(professor);

        ProfessorResponse professorResponse = mapperProfessorToProfessorResponse.toResponse(professor);

        professorResponse.setMensagem("Professor atualizado com sucesso!!!");

        return professorResponse;

    }

    public void deletar(Long id) {
        professorRepository.deleteById(id);

    }

    public List<GetProfessorListarResponse> listar() {

        List<Professor> listaProfessores = professorRepository.findAll();

        return listaProfessores
                .stream()
                .map(mapperProfessorToProfessorListarResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetProfessorObterResponse obter(Long id) {

        Professor professor = professorRepository.findById(id).get();

        GetProfessorObterResponse getProfessorObterResponse = mapperProfessorToProfessorObterResponse.toObter(professor);

        return getProfessorObterResponse;
    }

}