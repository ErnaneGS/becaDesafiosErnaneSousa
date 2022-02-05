package io.github.becaErnaneSousa.desafios.servicesimplements;

import io.github.becaErnaneSousa.desafios.dtos.requests.administracao.TurmaRequest;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaListarResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.GetTurmaObterResponse;
import io.github.becaErnaneSousa.desafios.dtos.responses.administracao.TurmaResponse;
import io.github.becaErnaneSousa.desafios.entities.administracao.Turma;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Professor;
import io.github.becaErnaneSousa.desafios.repositories.ProfessorRepository;
import io.github.becaErnaneSousa.desafios.repositories.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TurmaServiceImpl {

    private final ProfessorRepository professorRepository;
    private final TurmaRepository turmaRepository;

    public TurmaResponse criar(TurmaRequest turmaRequest) {

        Turma turma = new Turma();
        turma.setNome(turmaRequest.getNome());
        turma.setDataInicio(turmaRequest.getDataInicio());
        turma.setDataFim(turmaRequest.getDataFim());
        turma.setQuantidadeAluno(turmaRequest.getQuantidadeAluno());
        turma.setStatus(turmaRequest.isStatus());

        if(turmaRequest.getProfessor() != null) {

            Professor professorObtido = professorRepository.findById(turmaRequest.getProfessor().getId()).get();

            turma.setProfessor(professorObtido);
        }

        Turma turmaSalva = turmaRepository.save(turma);

        TurmaResponse turmaResponse = new TurmaResponse();
        turmaResponse.setCadastro(turma.getId());
        turmaResponse.setMensagem("Turma " + turmaSalva.getId() + " - " + turmaSalva.getNome() + " criada com sucesso.");

        return turmaResponse;

    }

    public TurmaResponse atualizar(TurmaRequest turmaRequest, Long id) {

        Turma turmaObtida = turmaRepository.findById(id).get();

        if(turmaRequest.getNome() != null) {
            turmaObtida.setNome(turmaRequest.getNome());
        }

        if(turmaRequest.getDataInicio() != null) {
            turmaObtida.setDataInicio(turmaRequest.getDataInicio());
        }

        if(turmaRequest.getDataFim() != null) {
            turmaObtida.setDataFim(turmaRequest.getDataFim());
        }

        if(turmaRequest.getQuantidadeAluno() != 0) {
            turmaObtida.setQuantidadeAluno(turmaRequest.getQuantidadeAluno());
        }

        turmaObtida.setStatus(turmaRequest.isStatus());

        if(turmaRequest.getProfessor() != null) {

            Professor professorObtido = professorRepository.findById(turmaRequest.getProfessor().getId()).get();

            turmaObtida.setProfessor(turmaRequest.getProfessor());
        }

        turmaRepository.save(turmaObtida);

        TurmaResponse turmaResponse = new TurmaResponse();
        turmaResponse.setCadastro(turmaObtida.getId());
        turmaResponse.setMensagem("Turma " + turmaObtida.getId() + " - " + turmaObtida.getNome() + " atualizada com sucesso.");

        return turmaResponse;

    }

    public void deletar(Long id) {
        turmaRepository.deleteById(id);
    }


    public List<GetTurmaListarResponse> listar() {

        List<Turma> listatUrma = turmaRepository.findAll();

        List<GetTurmaListarResponse> getTurmaListarResponses = new ArrayList<>();

        listatUrma.stream().forEach(turma ->  getTurmaListarResponses.add(new GetTurmaListarResponse(turma)));

        return getTurmaListarResponses;
    }

    public GetTurmaObterResponse obter(Long id) {

        Turma turma = turmaRepository.findById(id).get();

        if(turma == null) {
            throw new RuntimeException("Turma não encontrado!");
        }

        GetTurmaObterResponse getTurmaObterResponse = new GetTurmaObterResponse();
        getTurmaObterResponse.setNome(turma.getNome());
        getTurmaObterResponse.setDataInicio(turma.getDataInicio());
        getTurmaObterResponse.setDataFim(turma.getDataFim());
        getTurmaObterResponse.setQuantidadeAluno(turma.getQuantidadeAluno());
        getTurmaObterResponse.setStatus(turma.isStatus());
        getTurmaObterResponse.setProfessor(turma.getProfessor());
        getTurmaObterResponse.setListaAtividades(turma.getListaAtividades());
        getTurmaObterResponse.setListaMatriculas(turma.getListaMatriculas());

        return getTurmaObterResponse;
    }

}
