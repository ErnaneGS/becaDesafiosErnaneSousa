package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequestPatch;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.*;
import io.github.becaErnaneSousa.desafios.domains.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.mappers.*;
import io.github.becaErnaneSousa.desafios.repositories.DiretorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiretorServiceImpl {

    private final DiretorRepository diretorRepository;
    private final MapperDiretorRequestToDiretor mapperDiretorRequestToDiretor;
    private final MapperDiretorToDiretorResponse mapperDiretorToDiretorResponse;
    private final MapperDiretorAtualizar mapperDiretorAtualizar;
    private final MapperDiretorToListarDiretorResponse mapperDiretorToListarDiretorResponse;
    private final MapperDiretorToObterDiretorResponse mapperDiretorToObterDiretorResponse;

    public DiretorResponse criar(DiretorRequest diretorRequest) {

        Diretor diretor = mapperDiretorRequestToDiretor.toModel(diretorRequest);

        diretorRepository.save(diretor);

        DiretorResponse diretorResponse = mapperDiretorToDiretorResponse.toResponse(diretor);

        diretorResponse.setMensagem("Diretor criada com sucesso!!!");

        return diretorResponse;
    }

    public DiretorResponse atualizar(DiretorRequestPatch diretorRequestPatch, Long id) {

        Diretor diretor = diretorRepository.findById(id).get();

        mapperDiretorAtualizar.atualizar(diretorRequestPatch, diretor);

        diretorRepository.save(diretor);

        DiretorResponse diretorResponse = mapperDiretorToDiretorResponse.toResponse(diretor);

        diretorResponse.setMensagem("Diretor atualizado com sucesso!!!");

        return diretorResponse;
    }

    public void deletar(Long id) {
        diretorRepository.deleteById(id);
    }

    public List<GetDiretorListarResponse> listar() {
        List<Diretor> listaDiretores = diretorRepository.findAll();

        return listaDiretores
                .stream()
                .map(mapperDiretorToListarDiretorResponse::toListar)
                .collect(Collectors.toList());

    }

    public GetDiretorObterResponse obter(Long id) {
        Diretor diretor = diretorRepository.findById(id).get();

        GetDiretorObterResponse getDiretorObterResponse = mapperDiretorToObterDiretorResponse.toObter(diretor);

        return getDiretorObterResponse;

    }

}
