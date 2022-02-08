package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetMatriculaObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperMatriculaToMatriculaObterResponse {

    public GetMatriculaObterResponse toObter(Matricula matricula);

}
