package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequestPatch;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.AlunoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoObterResponse;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl {

    private final AlunoRepository alunoRepository;
    private final MapperAlunoRequestToAluno mapperAlunoRequestToAluno;
    private final MapperAlunoToAlunoResponse mapperAlunoToAlunoResponse;
    private final MapperAlunoAtualizar mapperAlunoAtualizar;
    private final MapperAlunoToListarAlunoResponse mapperAlunoToListarAlunoResponse;
    private final MapperAlunoToObterAlunoResponse mapperAlunoToObterAlunoResponse;

    public AlunoResponse criar(AlunoRequest alunoRequest) {

        Aluno aluno = mapperAlunoRequestToAluno.toModel(alunoRequest);

        alunoRepository.save(aluno);

        AlunoResponse alunoResponse = mapperAlunoToAlunoResponse.toResponse(aluno);

        alunoResponse.setMensagem("Aluno criada com sucesso!!!");

        return alunoResponse;
    }

    public AlunoResponse atualizar(AlunoRequestPatch alunoRequestPatch, Long id) {

        Aluno aluno = alunoRepository.findById(id).get();

        mapperAlunoAtualizar.atualizar(alunoRequestPatch, aluno);

        alunoRepository.save(aluno);

        AlunoResponse alunoResponse = mapperAlunoToAlunoResponse.toResponse(aluno);

        alunoResponse.setMensagem("Aluno atualizado com sucesso!!!");

        return alunoResponse;
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);

    }

    public List<GetAlunoListarResponse> listar() {

        List<Aluno> listaAlunos = alunoRepository.findAll();

        return listaAlunos
                .stream()
                .map(mapperAlunoToListarAlunoResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetAlunoObterResponse obter(Long id) {

        Aluno aluno = alunoRepository.findById(id).get();

        if(aluno == null) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        GetAlunoObterResponse getAlunoObterResponse = mapperAlunoToObterAlunoResponse.toObter(aluno);

        return getAlunoObterResponse;
    }

}
