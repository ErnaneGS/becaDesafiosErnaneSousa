package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperResultadoToResultadoListarResponse {

    public GetResultadoListarResponse toListar(Resultado resultado);

}
