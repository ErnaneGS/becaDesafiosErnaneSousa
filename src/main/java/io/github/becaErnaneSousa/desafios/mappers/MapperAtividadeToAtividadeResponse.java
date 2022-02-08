package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.AtividadeResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAtividadeToAtividadeResponse {

    public AtividadeResponse toResponse(Atividade atividade);

}
