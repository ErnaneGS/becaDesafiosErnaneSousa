package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoToObterCursoResponse {

    public GetCursoObterResponse toObter(Curso curso);

}
