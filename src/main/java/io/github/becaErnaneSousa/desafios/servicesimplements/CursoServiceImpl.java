package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.CursoRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.CursoResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetCursoObterResponse;
import io.github.becaErnaneSousa.desafios.entities.administracao.Curso;
import io.github.becaErnaneSousa.desafios.repositories.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl {

    private final CursoRepository cursoRepository;

    public CursoResponse criar(CursoRequest cursoRequest) {

        Curso curso = new Curso();
        curso.setNome(cursoRequest.getNome());
        curso.setDescricao(cursoRequest.getDescricao());
        curso.setCargaHoraria(cursoRequest.getCargaHoraria());


        Curso cursoSalvo = cursoRepository.save(curso);

        CursoResponse cursoResponse = new CursoResponse();
        cursoResponse.setCadastro(cursoSalvo.getId());
        cursoResponse.setMensagem("Curso " + cursoSalvo.getId() + " - " + cursoSalvo.getNome() + " criado com sucesso.");

        return cursoResponse;

    }

    public CursoResponse atualizar(CursoRequest cursoRequest, Long id) {

        Curso cursoObtido = cursoRepository.findById(id).get();

        if(cursoRequest.getNome() != null) {
            cursoObtido.setNome(cursoRequest.getNome());
        }

        if(cursoRequest.getDescricao() != null) {
            cursoObtido.setDescricao(cursoRequest.getDescricao());
        }

        if(cursoRequest.getCargaHoraria() != 0) {
            cursoObtido.setCargaHoraria(cursoRequest.getCargaHoraria());
        }

        cursoRepository.save(cursoObtido);

        CursoResponse cursoResponse = new CursoResponse();
        cursoResponse.setCadastro(cursoObtido.getId());
        cursoResponse.setMensagem("Curso " + cursoObtido.getId() + " - " + cursoObtido.getNome() + " atualizado com sucesso.");

        return cursoResponse;
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);

    }

    public List<GetCursoListarResponse> listar() {

        List<Curso> listaCurso = cursoRepository.findAll();

        List<GetCursoListarResponse> getCursoListarResponses = new ArrayList<>();

        listaCurso.stream().forEach(curso ->  getCursoListarResponses.add(new GetCursoListarResponse(curso)));

        return getCursoListarResponses;
    }

    public GetCursoObterResponse obter(Long id) {

        Curso curso = cursoRepository.findById(id).get();

        if(curso == null) {
            throw new RuntimeException("Aluno não encontrado!");
        }

        GetCursoObterResponse getCursoObterResponse = new GetCursoObterResponse();
        getCursoObterResponse.setId(curso.getId());
        getCursoObterResponse.setNome(curso.getNome());
        getCursoObterResponse.setDescricao(curso.getDescricao());
        getCursoObterResponse.setCargaHoraria(curso.getCargaHoraria());

        return getCursoObterResponse;
    }

}