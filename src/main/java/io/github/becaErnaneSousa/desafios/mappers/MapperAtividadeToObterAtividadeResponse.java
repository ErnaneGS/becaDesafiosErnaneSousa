package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAtividadeToObterAtividadeResponse {

    public GetAtividadeObterResponse toObter(Atividade atividade);

}
