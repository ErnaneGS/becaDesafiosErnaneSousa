package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.ResultadoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperResultadoAtualizar {

    public void atualizar(ResultadoRequest resultadoRequest, @MappingTarget Resultado resultado);

}
