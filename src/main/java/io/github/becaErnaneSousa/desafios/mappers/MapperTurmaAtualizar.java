package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperTurmaAtualizar {

    public void atualizar(TurmaRequest turmaRequest, @MappingTarget Turma turma);

}
