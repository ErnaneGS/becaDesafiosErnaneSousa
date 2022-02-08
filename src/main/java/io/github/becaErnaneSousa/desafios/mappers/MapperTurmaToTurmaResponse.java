package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.TurmaResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperTurmaToTurmaResponse {

    public TurmaResponse toResponse(Turma turma);

}
