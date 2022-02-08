package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.EscolaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperEscolaAtualizar {

    public void atualizar(EscolaRequest escolaRequest, @MappingTarget Escola escola);

}
