package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperEscolaToEscolaObterResponse {

    public GetEscolaObterResponse toObter(Escola eScola);
}
