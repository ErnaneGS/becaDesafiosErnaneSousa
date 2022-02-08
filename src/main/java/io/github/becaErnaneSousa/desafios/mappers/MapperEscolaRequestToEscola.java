package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.EscolaRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperEscolaRequestToEscola {

    public Escola toMOdel(EscolaRequest escolaRequest);

}
