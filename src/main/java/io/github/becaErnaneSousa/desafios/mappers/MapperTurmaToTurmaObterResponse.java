package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperTurmaToTurmaObterResponse {

    public GetTurmaObterResponse toObter(Turma turma);

}
