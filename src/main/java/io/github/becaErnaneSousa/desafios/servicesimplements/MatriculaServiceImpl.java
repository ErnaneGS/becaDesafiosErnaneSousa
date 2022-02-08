package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.domains.administracao.Matricula;
import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.MatriculaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.*;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.MatriculaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl {

    private final MatriculaRepository matriculaRepository;
    private final MapperMatriculaToMatriculaResponse mapperMatriculaToMatriculaResponse;
    private final MapperMatriculaRequestToMatricula mapperMatriculaRequestToMatricula;
    private final MapperMatriculaAtualizar mapperMatriculaAtualizar;
    private final MapperMatriculaToMatriculaListarResponse mapperMatriculaToMatriculaListarResponse;
    private final MapperMatriculaToMatriculaObterResponse mapperMatriculaToMatriculaObterResponse;


    public MatriculaResponse criar(MatriculaRequest matriculaRequest) {

        Matricula matricula = mapperMatriculaRequestToMatricula.toMOdel(matriculaRequest);

        matriculaRepository.save(matricula);

        MatriculaResponse matriculaResponse = mapperMatriculaToMatriculaResponse.toResponse(matricula);

        matriculaResponse.setMensagem("Matricula criada com sucesso!!!");

        return matriculaResponse;

    }

    public MatriculaResponse atualizar(MatriculaRequest matriculaRequest, Long id) {

        Matricula matricula = matriculaRepository.findById(id).get();

        mapperMatriculaAtualizar.atualizar(matriculaRequest, matricula);

        matriculaRepository.save(matricula);

        MatriculaResponse matriculaResponse = mapperMatriculaToMatriculaResponse.toResponse(matricula);

        matriculaResponse.setMensagem("Matricula atualizada com sucesso!!!");

        return matriculaResponse;

    }

    public void deletar(Long id) {
        matriculaRepository.deleteById(id);
    }

    public List<GetMatriculaListarResponse> listar() {
        List<Matricula> listaMatriculas = matriculaRepository.findAll();

        return listaMatriculas
                .stream()
                .map(mapperMatriculaToMatriculaListarResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetMatriculaObterResponse obter(Long id) {
        Matricula matricula = matriculaRepository.findById(id).get();

        GetMatriculaObterResponse getMatriculaObterResponse = mapperMatriculaToMatriculaObterResponse.toObter(matricula);

        return new GetMatriculaObterResponse();
    }
}
