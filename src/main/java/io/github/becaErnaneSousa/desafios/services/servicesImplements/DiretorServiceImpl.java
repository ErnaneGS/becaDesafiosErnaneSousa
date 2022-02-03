package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.pessoas.DiretorRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.pessoas.*;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.repositories.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiretorServiceImpl {

    @Autowired
    private DiretorRepository diretorRepository;

    public DiretorResponse criar(DiretorRequest diretorRequest) {

        Diretor diretor = new Diretor();
        diretor.setNome(diretorRequest.getNome());
        diretor.setDataNascimento(diretorRequest.getDataNascimento());
        diretor.setEndereco(diretorRequest.getEndereco());
        diretor.setTelefone(diretorRequest.getTelefone());
        diretor.setCpf(diretorRequest.getCpf());

        if( diretor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (diretor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (diretor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Diretor diretorSalvo = diretorRepository.save(diretor);

        DiretorResponse diretorResponse = new DiretorResponse();
        diretorResponse.setCadastro(diretorSalvo.getId());
        diretorResponse.setMensagem("Diretor " + diretorSalvo.getId() + " - " + diretorSalvo.getNome() + " criado com sucesso.");


        return diretorResponse;
    }

    public DiretorResponse atualizar(DiretorRequest diretorRequest, Long id) {

        Diretor diretorObtido = diretorRepository.findById(id).get();

        if(diretorRequest.getNome() != null) {
            diretorObtido.setNome(diretorRequest.getNome());
        }

        if(diretorRequest.getCpf() != null) {
            diretorObtido.setCpf(diretorRequest.getCpf());
        }

        if(diretorRequest.getEndereco() != null) {
            diretorObtido.setEndereco(diretorRequest.getEndereco());
        }

        if(diretorRequest.getTelefone() != null) {
            diretorObtido.setTelefone(diretorRequest.getTelefone());
        }

        if(diretorRequest.getDataNascimento() != null) {
            diretorObtido.setDataNascimento(diretorRequest.getDataNascimento());
        }

        diretorRepository.save(diretorObtido);
        DiretorResponse diretorResponse = new DiretorResponse();
        diretorResponse.setCadastro(diretorObtido.getId());
        diretorResponse.setMensagem("Diretor " + diretorObtido.getId() + " - " + diretorObtido.getNome() + " atualizado com sucesso.");

        return diretorResponse;
    }

    public void deletar(Long id) {
        diretorRepository.deleteById(id);
    }

    public List<GetDiretorListarResponse> listar() {

        List<Diretor> listaDiretor = diretorRepository.findAll();

        List<GetDiretorListarResponse> getDiretorListarResponses = new ArrayList<>();

        listaDiretor.stream().forEach(diretor ->  getDiretorListarResponses.add(new GetDiretorListarResponse(diretor)));

        return getDiretorListarResponses;

    }

    public GetDiretorObterResponse obter(Long id) {
        Diretor diretor = diretorRepository.findById(id).get();

        if(diretor == null) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        GetDiretorObterResponse getDiretorObterResponse = new GetDiretorObterResponse();
        getDiretorObterResponse.setId(diretor.getId());
        getDiretorObterResponse.setNome(diretor.getNome());
        getDiretorObterResponse.setCpf(diretor.getCpf());
        getDiretorObterResponse.setTelefone(diretor.getTelefone());
        getDiretorObterResponse.setEndereco(diretor.getEndereco());
        getDiretorObterResponse.setDataNascimento(diretor.getDataNascimento());

        return getDiretorObterResponse;

    }

}
