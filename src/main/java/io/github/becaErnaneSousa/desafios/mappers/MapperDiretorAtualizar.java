package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequestPatch;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperDiretorAtualizar {

    public void atualizar(DiretorRequestPatch diretorRequestPatch, @MappingTarget Diretor diretor);

}
