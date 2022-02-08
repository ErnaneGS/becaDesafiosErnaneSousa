package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProfessorRequestToProfessor {

    public Professor toMOdel(ProfessorRequest professorRequest);

}
