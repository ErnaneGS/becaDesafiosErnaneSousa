package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperEscolaToEscolaListarResponse {

    public GetEscolaListarResponse toListar(Escola escola);
}
