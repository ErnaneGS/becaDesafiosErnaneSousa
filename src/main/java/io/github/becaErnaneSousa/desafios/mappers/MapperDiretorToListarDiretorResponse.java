package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetDiretorListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperDiretorToListarDiretorResponse {

    public GetDiretorListarResponse toListar(Diretor diretor);

}
