package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperDiretorRequestToDiretor {

    public Diretor toModel(DiretorRequest diretorRequest);

}
