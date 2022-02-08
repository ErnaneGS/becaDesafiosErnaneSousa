package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequestPatch;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperCursoAtualizar {

    public void atualizar(CursoRequestPatch cursoRequestPatch, @MappingTarget Curso curso);

}
