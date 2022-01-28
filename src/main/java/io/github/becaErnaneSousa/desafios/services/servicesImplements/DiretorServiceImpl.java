package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiretorServiceImpl implements ServiceInterface<Diretor> {

    Diretor diretor = new Diretor(001l,"Carlos Eduardo", "14285634666", "Sousa", "31 995182764", "08011999");

    @Override
    public Diretor criar(Diretor diretor) {
        System.out.println(diretor);

        if( diretor.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (diretor.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (diretor.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }
        return diretor;

    }

    @Override
    public Diretor atualizar(Diretor diretor01, long id) {
        diretor = diretor01;

        return diretor;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Diretor> listar() {

        return (List.of(diretor));
    }

    @Override
    public Diretor obter(long id) {
        return diretor;
    }

}
