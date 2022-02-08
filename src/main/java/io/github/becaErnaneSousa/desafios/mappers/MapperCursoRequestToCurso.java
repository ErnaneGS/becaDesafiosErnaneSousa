package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCursoRequestToCurso {

    public Curso toModel(CursoRequest cursoRequest);
}
