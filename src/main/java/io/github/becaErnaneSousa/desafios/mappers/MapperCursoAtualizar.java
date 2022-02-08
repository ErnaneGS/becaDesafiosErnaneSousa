package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperCursoAtualizar {

    public void atualizar(CursoRequest cursoRequest, @MappingTarget Curso curso);

}
