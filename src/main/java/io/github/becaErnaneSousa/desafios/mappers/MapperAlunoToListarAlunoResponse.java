package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoListarResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperAlunoToListarAlunoResponse {

    public GetAlunoListarResponse toListar(Aluno aluno);

}
