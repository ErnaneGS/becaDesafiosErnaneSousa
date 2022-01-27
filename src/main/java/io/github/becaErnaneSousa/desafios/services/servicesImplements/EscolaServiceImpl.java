package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.EscolaInterface;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EscolaServiceImpl implements EscolaInterface {

    Diretor diretor = new Diretor(001l,"Carlos Eduardo", "14285634666", "Sousa", "31 995182764", "08011999");
    Escola escola = new Escola(11, "Escola Rio MAnso", "Rio Manso", "00000000000001", diretor);

    @Override
    public Escola criar(Escola escola) {
        System.out.println(escola);

        if( escola.getCnpj().length() == 14 ) {
            throw new RuntimeException("O CNPJ deve conter 14 caracteres");
        } else {
            return escola;
        }

    }

    @Override
    public Escola atualizar(Escola escola01, long id) {
       escola = escola01;

        return escola ;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Escola> listar() {
        return (List.of(escola)
        );
    }

    @Override
    public Escola obter(long id) {

        return escola;
    }
}
