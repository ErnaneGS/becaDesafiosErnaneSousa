package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.ProfessorResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProfessorToProfessorResponse {

    public ProfessorResponse toResponse(Professor professor);

}
