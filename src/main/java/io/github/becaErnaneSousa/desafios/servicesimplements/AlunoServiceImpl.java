package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.AlunoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.AlunoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.GetAlunoObterResponse;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl {

    private final AlunoRepository alunoRepository;

    public AlunoResponse criar(AlunoRequest alunoRequest) {

        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequest.getNome());
        aluno.setCpf(alunoRequest.getCpf());
        aluno.setEndereco(alunoRequest.getEndereco());
        aluno.setTelefone(alunoRequest.getTelefone());
        aluno.setDataNascimento(alunoRequest.getDataNascimento());
        aluno.setNomePai(alunoRequest.getNomePai());

        if(aluno.getCpf().length() != 11) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (aluno.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (aluno.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Aluno alunoSalvo = alunoRepository.save(aluno);

        AlunoResponse alunoResponse = new AlunoResponse();
        alunoResponse.setCadastro(alunoSalvo.getId());
        alunoResponse.setMensagem("Aluno " + alunoSalvo.getId() + " - " + alunoSalvo.getNome() + " criado com sucesso.");

        return alunoResponse;

    }

    public AlunoResponse atualizar(AlunoRequest alunoRequest, Long id) {

        Aluno alunoObtido = alunoRepository.findById(id).get();

        if(alunoRequest.getNome() != null) {
            alunoObtido.setNome(alunoRequest.getNome());
        }

        if(alunoRequest.getCpf() != null) {
            alunoObtido.setCpf(alunoRequest.getCpf());
        }

        if(alunoRequest.getEndereco() != null) {
            alunoObtido.setEndereco(alunoRequest.getEndereco());
        }

        if(alunoRequest.getTelefone() != null) {
            alunoObtido.setTelefone(alunoRequest.getTelefone());
        }

        if(alunoRequest.getDataNascimento() != null) {
            alunoObtido.setDataNascimento(alunoRequest.getDataNascimento());
        }

        if(alunoRequest.getNomePai() != null) {
            alunoObtido.setNomePai(alunoRequest.getNomePai());
        }

        alunoRepository.save(alunoObtido);

        AlunoResponse alunoResponse = new AlunoResponse();
        alunoResponse.setCadastro(alunoObtido.getId());
        alunoResponse.setMensagem("Aluno " + alunoObtido.getId() + " - " + alunoObtido.getNome() + " atualizado com sucesso.");

        return alunoResponse;
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);

    }

    public List<GetAlunoListarResponse> listar() {

        List<Aluno> listaAluno = alunoRepository.findAll();

        List<GetAlunoListarResponse> getAlunoListarResponses = new ArrayList<>();

        listaAluno.stream().forEach(aluno ->  getAlunoListarResponses.add(new GetAlunoListarResponse(aluno)));

        return getAlunoListarResponses;
    }

    public GetAlunoObterResponse obter(Long id) {

        Aluno aluno = alunoRepository.findById(id).get();

        if(aluno == null) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        GetAlunoObterResponse getAlunoObterResponse = new GetAlunoObterResponse();
        getAlunoObterResponse.setId(aluno.getId());
        getAlunoObterResponse.setNome(aluno.getNome());
        getAlunoObterResponse.setCpf(aluno.getCpf());
        getAlunoObterResponse.setTelefone(aluno.getTelefone());
        getAlunoObterResponse.setEndereco(aluno.getEndereco());
        getAlunoObterResponse.setNomePai(aluno.getNomePai());
        getAlunoObterResponse.setDataNascimento(aluno.getDataNascimento());

        return getAlunoObterResponse;
    }

}
