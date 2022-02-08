package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.ResultadoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperResultadoToResultadoResponse {

    public ResultadoResponse toResponse(Resultado resultado);
}
