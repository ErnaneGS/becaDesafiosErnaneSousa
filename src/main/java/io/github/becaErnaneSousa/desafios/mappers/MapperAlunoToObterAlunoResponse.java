package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoObterResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoToObterAlunoResponse {

    public GetAlunoObterResponse toObter(Aluno aluno);

}
