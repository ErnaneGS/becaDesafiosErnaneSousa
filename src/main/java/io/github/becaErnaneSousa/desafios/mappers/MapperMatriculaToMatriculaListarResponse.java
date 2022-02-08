package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetMatriculaListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperMatriculaToMatriculaListarResponse {

    public GetMatriculaListarResponse toListar(Matricula matricula);

}
