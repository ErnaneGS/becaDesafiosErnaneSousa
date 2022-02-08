package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.domains.atividades.Resultado;
import io.github.becaErnaneSousa.desafios.dtos.requests.atividades.ResultadoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.GetResultadoObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.atividades.ResultadoResponse;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.ResultadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResultadoServiceImpl {

    private final ResultadoRepository resultadoRepository;
    private final MapperResultadoRequestToResultado mapperResultadoRequestToResultado;
    private final MapperResultadoToResultadoResponse mapperResultadoToResultadoResponse;
    private final MapperResultadoAtualizar mapperResultadoAtualizar;
    private final MapperResultadoToResultadoListarResponse mapperResultadoToResultadoListarResponse;
    private final MapperResultadoToResultadoObterResponse mapperResultadoToResultadoObterResponse;

    public ResultadoResponse criar(ResultadoRequest resultadoRequest) {

        Resultado resultado = mapperResultadoRequestToResultado.toModel(resultadoRequest);

        resultadoRepository.save(resultado);

        ResultadoResponse resultadoResponse = mapperResultadoToResultadoResponse.toResponse(resultado);

        resultadoResponse.setMensagem("Resultado criada com sucesso!!!");

        return resultadoResponse;
    }

    public ResultadoResponse atualizar(ResultadoRequest resultadoRequest, Long id) {

        Resultado resultado = resultadoRepository.findById(id).get();

        mapperResultadoAtualizar.atualizar(resultadoRequest, resultado);

        resultadoRepository.save(resultado);

        ResultadoResponse resultadoResponse = mapperResultadoToResultadoResponse.toResponse(resultado);

        resultadoResponse.setMensagem("Resultado atualizado com sucesso!!!");

        return resultadoResponse;

    }

    public void deletar(Long id) {
        resultadoRepository.deleteById(id);

    }

    public List<GetResultadoListarResponse> listar() {

        List<Resultado> listaResultados = resultadoRepository.findAll();

        return listaResultados
                .stream()
                .map(mapperResultadoToResultadoListarResponse::toListar)
                .collect(Collectors.toList());
    }

    public GetResultadoObterResponse obter(Long id) {

        Resultado resultado = resultadoRepository.findById(id).get();

        GetResultadoObterResponse getResultadoObterResponse = mapperResultadoToResultadoObterResponse.toObter(resultado);

        return getResultadoObterResponse;
    }
}
