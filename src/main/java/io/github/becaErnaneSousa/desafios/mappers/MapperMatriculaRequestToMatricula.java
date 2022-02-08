package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.MatriculaRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperMatriculaRequestToMatricula {

    public Matricula toMOdel(MatriculaRequest matriculaRequest);

}
