package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequestPatch;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperAlunoAtualizar {

    public void atualizar(AlunoRequestPatch alunoRequestPatch, @MappingTarget Aluno aluno);

}

