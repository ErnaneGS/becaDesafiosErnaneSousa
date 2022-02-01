package io.github.becaErnaneSousa.desafios.services.servicesImplements;

import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.repositories.CursoRepository;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoServiceImpl implements ServiceInterface<Curso> {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso criar(Curso curso) {

        Curso cursoSalvo = cursoRepository.save(curso);

        return cursoSalvo;
    }

    @Override
    public Curso atualizar(Curso curso, Long id) {

        Curso cursoObtido = this.obter(id);
        cursoObtido.setNome(curso.getNome());
        cursoObtido.setDescricao(curso.getDescricao());
        cursoObtido.setCargaHoraria(curso.getCargaHoraria());

        cursoRepository.save(cursoObtido);

        return curso;
    }

    @Override
    public void deletar(Long id) {
        cursoRepository.deleteById(id);

    }

    @Override
    public List<Curso> listar() {

        List<Curso> listaCurso = cursoRepository.findAll();

        return listaCurso;
    }

    @Override
    public Curso obter( Long id) {
        Curso curso = cursoRepository.findById(id).get();

        return curso;
    }

}