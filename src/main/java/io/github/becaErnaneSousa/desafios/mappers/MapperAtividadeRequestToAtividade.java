package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.AtividadeRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAtividadeRequestToAtividade {

    public Atividade toModel(AtividadeRequest atividadeRequest);
}
