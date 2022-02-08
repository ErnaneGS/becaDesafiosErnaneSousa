package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoRequestToAluno {

    public Aluno toModel(AlunoRequest alunoRequest);
}
