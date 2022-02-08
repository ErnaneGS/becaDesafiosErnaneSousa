package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperResultadoToResultadoObterResponse {

    public GetResultadoObterResponse toObter(Resultado resultado);

}
