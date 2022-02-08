package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.CursoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoToCursoResponse {

    public CursoResponse toResponse(Curso curso);

}
