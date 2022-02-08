package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoToListarCursoResponse {

    public GetCursoListarResponse toListar(Curso curso);

}
