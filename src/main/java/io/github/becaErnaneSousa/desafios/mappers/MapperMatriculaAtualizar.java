package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.MatriculaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperMatriculaAtualizar {

    public void atualizar(MatriculaRequest matriculaRequest, @MappingTarget Matricula matricula);

}
