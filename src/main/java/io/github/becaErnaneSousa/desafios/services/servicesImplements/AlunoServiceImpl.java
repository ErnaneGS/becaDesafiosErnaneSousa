package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.repositories.AlunoRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoServiceImpl implements ServiceInterface<Aluno> {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno criar(Aluno aluno) {

        if( aluno.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (aluno.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (aluno.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Aluno alunoSalvo = alunoRepository.save(aluno);
        return alunoSalvo;

    }

    @Override
    public Aluno atualizar(Aluno aluno, Long id) {
        Aluno alunoObtido = this.obter(id);
        alunoObtido.setNome(aluno.getNome());
        alunoObtido.setCpf(aluno.getCpf());
        alunoObtido.setEndereco(aluno.getEndereco());
        alunoObtido.setTelefone(aluno.getTelefone());
        alunoObtido.setDataNascimento(aluno.getDataNascimento());
        alunoObtido.setNomePai(aluno.getNomePai());

        alunoRepository.save(alunoObtido);

        return aluno;
    }

    @Override
    public void deletar(Long id) {
        alunoRepository.deleteById(id);

    }

    @Override
    public List<Aluno> listar() {
        List<Aluno> listaAluno = alunoRepository.findAll();

        return listaAluno;
    }

    @Override
    public Aluno obter(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();

        if(aluno == null) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        return aluno;
    }

//    public double notaTotal(){
//        aluno.setListaResultados(lista);
//    }

}
