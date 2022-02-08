package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.domains.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.AtividadeRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.AtividadeResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetAtividadeObterResponse;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.AtividadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AtividadeServiceImpl {

    private final AtividadeRepository atividadeRepository;
    private final MapperAtividadeRequestToAtividade mapperAtividadeRequestToAtividade;
    private final MapperAtividadeToAtividadeResponse mapperAtividadeToAtividadeResponse;
    private final MapperAtividadeAtualizar mapperAtividadeAtualizar;
    private final MapperAtividadeToObterAtividadeResponse mapperAtividadeToObterAtividadeResponse;
    private final MapperAtividadeToListarAlunoResponse mapperAtividadeToListarAlunoResponse;

    public AtividadeResponse criar(AtividadeRequest atividadeRequest) {

        Atividade atividade = mapperAtividadeRequestToAtividade.toModel(atividadeRequest);

        atividadeRepository.save(atividade);

        AtividadeResponse atividadeResponse = mapperAtividadeToAtividadeResponse.toResponse(atividade);

        atividadeResponse.setMensagem("Atividade criada com sucesso!!!");

        return atividadeResponse;
    }

    public AtividadeResponse atualizar(AtividadeRequest atividadeRequest, Long id) {

        Atividade atividade = atividadeRepository.findById(id).get();

        mapperAtividadeAtualizar.atualizar(atividadeRequest, atividade);

        atividadeRepository.save(atividade);

        AtividadeResponse atividadeResponse = mapperAtividadeToAtividadeResponse.toResponse(atividade);

        atividadeResponse.setMensagem("Atividade atualizada com sucesso!!!");

        return atividadeResponse;

    }

    public void deletar(Long id) {
        atividadeRepository.deleteById(id);
    }

    public List<GetAtividadeListarResponse> listar() {
        List<Atividade> listaAtividades = atividadeRepository.findAll();

        return listaAtividades
                .stream()
                .map(mapperAtividadeToListarAlunoResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetAtividadeObterResponse obter(Long id) {
        Atividade atividade = atividadeRepository.findById(id).get();

        GetAtividadeObterResponse getAtividadeObterResponse = mapperAtividadeToObterAtividadeResponse.toObter(atividade);

        return getAtividadeObterResponse;

    }

}
