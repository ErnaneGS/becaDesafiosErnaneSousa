package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperDiretorAtualizar {

    public void atualizar(DiretorRequest diretorRequest, @MappingTarget Diretor diretor);

}
