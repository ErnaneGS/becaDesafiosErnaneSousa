package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import io.github.becaErnaneSousa.desafios.domains.administracao.Turma;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.TurmaResponse;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TurmaServiceImpl {

    private final TurmaRepository turmaRepository;
    private final MapperTurmaToTurmaResponse mapperTurmaToTurmaResponse;
    private final MapperTurmaRequestToTurma mapperTurmaRequestToTurma;
    private final MapperTurmaAtualizar mapperTurmaAtualizar;
    private final MapperTurmaToTurmaListarResponse mapperTurmaToTurmaListarResponse;
    private final MapperTurmaToTurmaObterResponse mapperTurmaToTurmaObterResponse;

    public TurmaResponse criar(TurmaRequest turmaRequest) {

        Turma turma = mapperTurmaRequestToTurma.toModel(turmaRequest);

       turmaRepository.save(turma);

       TurmaResponse turmaResponse = mapperTurmaToTurmaResponse.toResponse(turma);

       turmaResponse.setMensagem("Turma criada com sucesso.");

       return turmaResponse;

    }

    public TurmaResponse atualizar(TurmaRequest turmaRequest, Long id) {

        Turma turma = turmaRepository.findById(id).get();

        mapperTurmaAtualizar.atualizar(turmaRequest, turma);

        turmaRepository.save(turma);

        TurmaResponse turmaResponse = mapperTurmaToTurmaResponse.toResponse(turma);

        turmaResponse.setMensagem("Turma atualizada com sucesso!!!");

        return turmaResponse;

    }

    public void deletar(Long id) {
        turmaRepository.deleteById(id);
    }


    public List<GetTurmaListarResponse> listar() {

        List<Turma> listaTurmas = turmaRepository.findAll();

        return listaTurmas
                .stream()
                .map(mapperTurmaToTurmaListarResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetTurmaObterResponse obter(Long id) {

        Turma turma = turmaRepository.findById(id).get();

        if(turma == null) {
            throw new RuntimeException("Turma não encontrada!");
        }

        GetTurmaObterResponse getTurmaObterResponse = mapperTurmaToTurmaObterResponse.toObter(turma);

        return getTurmaObterResponse;
    }

}
