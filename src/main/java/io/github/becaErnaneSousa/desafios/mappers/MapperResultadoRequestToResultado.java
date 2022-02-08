package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.ResultadoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperResultadoRequestToResultado {

    public Resultado toModel(ResultadoRequest resultadoRequest);

}
