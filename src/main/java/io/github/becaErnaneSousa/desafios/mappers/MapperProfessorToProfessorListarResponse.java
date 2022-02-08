package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetProfessorListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProfessorToProfessorListarResponse {

    public GetProfessorListarResponse toListar(Professor professor);

}
