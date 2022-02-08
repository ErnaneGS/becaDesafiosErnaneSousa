package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.AlunoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoToAlunoResponse {

    public AlunoResponse toResponse(Aluno aluno);
}
