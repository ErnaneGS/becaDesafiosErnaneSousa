package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.EscolaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.EscolaResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaObterResponse;
import io.github.becaErnaneSousa.desafios.domains.administracao.Escola;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.EscolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EscolaServiceImpl {

    private final EscolaRepository escolaRepository;
    private final MapperEscolaRequestToEscola mapperEscolaRequestToEscola;
    private final MapperEscolaToEscolaResponse mapperEscolaToEscolaResponse;
    private final MapperEscolaAtualizar mapperEscolaAtualizar;
    private final MapperEscolaToEscolaListarResponse mapperEscolaToEscolaListarResponse;
    private final MapperEscolaToEscolaObterResponse mapperEscolaToEscolaObterResponse;

    public EscolaResponse criar(EscolaRequest escolaRequest) {

        Escola escola = mapperEscolaRequestToEscola.toMOdel(escolaRequest);

        escolaRepository.save(escola);

        EscolaResponse escolaReponse = mapperEscolaToEscolaResponse.toResponse(escola);

        escolaReponse.setMensagem("Escola criada com sucesso!!!");

        return escolaReponse;

    }

    public EscolaResponse atualizar(EscolaRequest escolaRequest, Long id) {

        Escola escola = escolaRepository.findById(id).get();

        mapperEscolaAtualizar.atualizar(escolaRequest, escola);

        escolaRepository.save(escola);

        EscolaResponse escolaResponse = mapperEscolaToEscolaResponse.toResponse(escola);

        escolaResponse.setMensagem("Escola atualizada com sucesso!!!");

        return escolaResponse;

    }

    public void deletar(Long id) {
        escolaRepository.deleteById(id);

    }

    public List<GetEscolaListarResponse> listar() {
        List<Escola> listaEscola = escolaRepository.findAll();

        return listaEscola
                .stream()
                .map(mapperEscolaToEscolaListarResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetEscolaObterResponse obter(Long id) {
        Escola escola = escolaRepository.findById(id).get();

        GetEscolaObterResponse getEscolaObterResponse = mapperEscolaToEscolaObterResponse.toObter(escola);

        return getEscolaObterResponse;
    }
}
