package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequestPatch;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.CursoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoObterResponse;
import io.github.becaErnaneSousa.desafios.domains.administracao.Curso;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl {

    private final CursoRepository cursoRepository;
    private final MapperCursoToCursoResponse mapperCursoToCursoResponse;
    private final MapperCursoRequestToCurso mapperCursoRequestToCurso;
    private final MapperCursoAtualizar mapperCursoAtualizar;
    private final MapperCursoToListarCursoResponse mapperCursoToListarCursoResponse;
    private final MapperCursoToObterCursoResponse mapperCursoToObterCursoResponse;


    public CursoResponse criar(CursoRequest cursoRequest) {

        Curso curso = mapperCursoRequestToCurso.toModel(cursoRequest);

        cursoRepository.save(curso);

        CursoResponse cursoResponse = mapperCursoToCursoResponse.toResponse(curso);

        cursoResponse.setMensagem("Curso cadastrado com sucesso!");

        return cursoResponse;

    }

    public CursoResponse atualizar(CursoRequestPatch cursoRequestPatch, Long id) {

        Curso curso = cursoRepository.findById(id).get();

        mapperCursoAtualizar.atualizar(cursoRequestPatch, curso);

        cursoRepository.save(curso);

        CursoResponse cursoResponse = mapperCursoToCursoResponse.toResponse(curso);

        cursoResponse.setMensagem("Curso atualizado com sucesso!!!");

        return cursoResponse;
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);

    }

    public List<GetCursoListarResponse> listar() {

        List<Curso> listaCursos = cursoRepository.findAll();

        return listaCursos
                .stream()
                .map(mapperCursoToListarCursoResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetCursoObterResponse obter(Long id) {

        Curso curso = cursoRepository.findById(id).get();

        if(curso == null) {
            throw new RuntimeException("Curso não encontrado!");
        }

        GetCursoObterResponse getCursoObterResponse = mapperCursoToObterCursoResponse.toObter(curso);

        return getCursoObterResponse;

    }

}