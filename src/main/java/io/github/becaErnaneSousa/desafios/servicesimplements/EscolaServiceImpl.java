package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.EscolaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.EscolaResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetEscolaObterResponse;
import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.repositories.DiretorRepository;
import io.github.becaErnaneSousa.desafios.repositories.EscolaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EscolaServiceImpl {

    private final DiretorRepository diretorRepository;
    private final EscolaRepository escolaRepository;

    public EscolaResponse criar(EscolaRequest escolaRequest) {

        Escola escola = new Escola();
        escola.setNome(escolaRequest.getNome());
        escola.setEndereco(escolaRequest.getEndereco());
        escola.setCnpj(escolaRequest.getCnpj());

        if (escolaRequest.getDiretor() != null) {

            Diretor diretorObtido = diretorRepository.findById(escolaRequest.getDiretor().getId()).get();

            escola.setDiretor(diretorObtido);

        }

        Escola escolaSalva = escolaRepository.save(escola);

        EscolaResponse escolaReponse = new EscolaResponse();
        escolaReponse.setCadastro(escolaSalva.getId());
        escolaReponse.setMensagem("Escola " + escolaSalva.getId() + " - " + escolaSalva.getNome() + " criada com sucesso.");

        return escolaReponse;

    }

    public EscolaResponse atualizar(EscolaRequest escolaRequest, Long id) {

        Escola escolaObtida = escolaRepository.findById(id).get();

        if(escolaRequest.getNome() != null) {
            escolaObtida.setNome(escolaRequest.getNome());
        }

        if(escolaRequest.getEndereco() != null) {
            escolaObtida.setEndereco(escolaRequest.getEndereco());
        }

        if(escolaRequest.getCnpj() != null) {
            escolaObtida.setCnpj(escolaRequest.getCnpj());
        }

        if (escolaRequest.getDiretor().getId() != null) {
            Diretor diretorObtido = diretorRepository.findById(escolaRequest.getDiretor().getId()).get();

            escolaObtida.setDiretor(diretorObtido);
        }

        escolaRepository.save(escolaObtida);

        EscolaResponse escolaReponse = new EscolaResponse();
        escolaReponse.setCadastro(escolaObtida.getId());
        escolaReponse.setMensagem("Escola " + escolaObtida.getId() + " - " + escolaObtida.getNome() + " atualizada com sucesso.");

        return escolaReponse;
    }

    public void deletar(Long id) {
        escolaRepository.deleteById(id);

    }

    public List<GetEscolaListarResponse> listar() {
        List<Escola> listaEscola = escolaRepository.findAll();

        List<GetEscolaListarResponse> getEscolaListarResponses = new ArrayList<>();

        listaEscola.stream().forEach(escola ->  getEscolaListarResponses.add(new GetEscolaListarResponse(escola)));

        return getEscolaListarResponses;
    }

    public GetEscolaObterResponse obter(Long id) {
        Escola escola = escolaRepository.findById(id).get();

        if(escola == null) {
            throw new RuntimeException("Escola não encontrada!");
        }

        GetEscolaObterResponse getEscolaObterResponse = new GetEscolaObterResponse();
        getEscolaObterResponse.setId(escola.getId());
        getEscolaObterResponse.setNome(escola.getNome());
        getEscolaObterResponse.setCnpj(escola.getCnpj());
        getEscolaObterResponse.setEndereco(escola.getEndereco());
        getEscolaObterResponse.setDiretor(escola.getDiretor());
        getEscolaObterResponse.setListaCursos(escola.getListaCursos());

        return getEscolaObterResponse;
    }
}
