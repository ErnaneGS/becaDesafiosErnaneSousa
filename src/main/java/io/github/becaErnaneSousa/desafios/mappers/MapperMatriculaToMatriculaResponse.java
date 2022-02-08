package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.MatriculaResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperMatriculaToMatriculaResponse {

    public MatriculaResponse toResponse(Matricula matricula);
}
