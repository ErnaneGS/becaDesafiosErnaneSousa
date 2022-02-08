package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperTurmaToTurmaListarResponse {

    public GetTurmaListarResponse toListar(Turma turma);

}
