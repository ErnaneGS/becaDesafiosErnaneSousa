package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperTurmaRequestToTurma {

    public Turma toModel(TurmaRequest turmaRequest);

}
