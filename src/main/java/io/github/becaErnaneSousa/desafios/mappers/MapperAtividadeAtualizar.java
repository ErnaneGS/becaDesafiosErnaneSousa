package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.AtividadeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperAtividadeAtualizar {

    public void atualizar(AtividadeRequest atividadeRequest, @MappingTarget Atividade atividade);

}
