package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.DiretorResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperDiretorToDiretorResponse {

    public DiretorResponse toResponse(Diretor diretor);
}
