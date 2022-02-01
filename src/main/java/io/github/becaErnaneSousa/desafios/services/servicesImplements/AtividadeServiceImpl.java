package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.atividades.Atividade;
import io.github.becaErnaneSousa.desafios.repositories.AtividadeRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtividadeServiceImpl implements ServiceInterface<Atividade> {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Override
    public Atividade criar(Atividade atividade) {

        Atividade atividadeSalva = atividadeRepository.save(atividade);

        return atividadeSalva;
    }

    @Override
    public Atividade atualizar(Atividade atividade, Long id) {
        Atividade atividadeObtida = this.obter(id);
        atividadeObtida.setNome(atividade.getNome());
        atividadeObtida.setDescricao(atividade.getDescricao());
        atividadeObtida.setNota(atividade.getNota());

        atividadeRepository.save(atividadeObtida);

        return atividade;
    }

    @Override
    public void deletar(Long id) {
        atividadeRepository.deleteById(id);
    }

    @Override
    public List<Atividade> listar() {
        List<Atividade> listaAtividade = atividadeRepository.findAll();

        return listaAtividade;
    }

    @Override
    public Atividade obter(Long id) {
        Atividade atividade = atividadeRepository.findById(id).get();

        return atividade;
    }

}
