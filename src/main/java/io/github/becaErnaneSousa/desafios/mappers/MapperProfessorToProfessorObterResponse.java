package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetProfessorObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProfessorToProfessorObterResponse {

    public GetProfessorObterResponse toObter(Professor professor);

}
