package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Escola;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Diretor;
import io.github.becaErnaneSousa.desafios.repositories.EscolaRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EscolaServiceImpl implements ServiceInterface<Escola> {

    @Autowired
    private DiretorServiceImpl diretorService;

    @Autowired
    private CursoServiceImpl cursoService;

    @Autowired
    private EscolaRepository escolaRepository;

    @Override
    public Escola criar(Escola escola) {

        if( escola.getCnpj().length() == 14 ) {
            throw new RuntimeException("O CNPJ deve conter 14 caracteres");
        }

        if (escola.getDiretor() != null) {
            Diretor diretorObtido = diretorService.obter(escola.getDiretor().getId());
            escola.setDiretor(diretorObtido);
        }

        Escola escolaSalva = escolaRepository.save(escola);

        return escolaSalva;

    }

    @Override
    public Escola atualizar(Escola escola, Long id) {

        Escola escolaObtida = this.obter(id);
        escolaObtida.setNome(escola.getNome());
        escolaObtida.setEndereco(escola.getEndereco());
        escolaObtida.setCnpj(escola.getCnpj());

        if (escola.getDiretor() != null) {
            Diretor diretorObtido = diretorService.obter(escola.getDiretor().getId());
            escola.setDiretor(diretorObtido);
        }

        escolaObtida.setDiretor(escola.getDiretor());

        escolaRepository.save(escolaObtida);

        return escola;
    }

    @Override
    public void deletar(Long id) {
        escolaRepository.deleteById(id);

    }

    @Override
    public List<Escola> listar() {
        List<Escola> listaEscola = escolaRepository.findAll();

        return listaEscola;
    }

    @Override
    public Escola obter(Long id) {
        Escola escola = escolaRepository.findById(id).get();

        return escola;
    }
}
