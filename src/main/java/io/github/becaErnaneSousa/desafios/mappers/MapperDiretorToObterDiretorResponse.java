package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetDiretorObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperDiretorToObterDiretorResponse {

    public GetDiretorObterResponse toObter(Diretor diretor);

}
