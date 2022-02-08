package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAtividadeToListarAlunoResponse {

    public GetAtividadeListarResponse toListar(Atividade atividade);

}
