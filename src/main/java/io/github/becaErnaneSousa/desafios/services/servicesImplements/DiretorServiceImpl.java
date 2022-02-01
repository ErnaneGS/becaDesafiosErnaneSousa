package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.repositories.DiretorRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiretorServiceImpl implements ServiceInterface<Diretor> {

    @Autowired
    private DiretorRepository diretorRepository;

    @Override
    public Diretor criar(Diretor diretor) {

        if( diretor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (diretor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (diretor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }

        Diretor diretorSalvo = diretorRepository.save(diretor);

        return diretorSalvo;

    }

    @Override
    public Diretor atualizar(Diretor diretor, Long id) {

        Diretor diretorObtido = this.obter(id);
        diretorObtido.setNome(diretor.getNome());
        diretorObtido.setCpf(diretor.getCpf());
        diretorObtido.setEndereco(diretor.getEndereco());
        diretorObtido.setTelefone(diretor.getTelefone());
        diretorObtido.setDataNascimento(diretor.getDataNascimento());

        diretorRepository.save(diretorObtido);

        return diretor;
    }

    @Override
    public void deletar(Long id) {
        diretorRepository.deleteById(id);
    }

    @Override
    public List<Diretor> listar() {

        List<Diretor> listaDiretor = diretorRepository.findAll();

        return listaDiretor;

    }

    @Override
    public Diretor obter(Long id) {
        Diretor diretor = diretorRepository.findById(id).get();

        return diretor;

    }

}
