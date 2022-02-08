package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.EscolaResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperEscolaToEscolaResponse {

    public EscolaResponse toResponse(Escola escola);

}
