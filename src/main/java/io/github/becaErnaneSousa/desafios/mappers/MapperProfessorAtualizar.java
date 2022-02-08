package io.github.becaErnaneSousa.desafios.mappers;

import io.github.becaErnaneSousa.desafios.domains.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.ProfessorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperProfessorAtualizar {

    public void atualizar(ProfessorRequest professorRequest, @MappingTarget Professor professor);

}
