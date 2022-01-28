package io.github.becaErnaneSousa.desafios.services.servicesImplements;
import io.github.becaErnaneSousa.desafios.entities.pessoas.Aluno;
import io.github.becaErnaneSousa.desafios.services.servicesInterface.ServiceInterface;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoServiceImpl implements ServiceInterface<Aluno> {

    Aluno aluno = new Aluno(001l, "Ernane Sousa", "00000000000", "31999999999", "Sousa", "08011992" ,"Jose");


    @Override
    public Aluno criar(Aluno aluno) {
        System.out.println(aluno);

        if( aluno.getCpf().length() != 11 ) {
            throw new RuntimeException("O cpf deve possuir 11 digitos");
        } else if (aluno.getDataNascimento().length() != 8){
            throw new RuntimeException("A data de nascimento deve possuir 8 digitos");
        } else if (aluno.getTelefone().length() != 11) {
            throw new RuntimeException("O telefone deve possuir 11 digitos");
        }
        return aluno;

    }

    @Override
    public Aluno atualizar(Aluno aluno01, long id) {
        aluno = aluno01;

        return aluno;
    }

    @Override
    public void deletar(long id) {

    }

    @Override
    public List<Aluno> listar() {
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno(003l, "Paulo Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(004l,"João Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(004l,"Maria Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));
        listaAlunos.add(new Aluno(005l,"Ana Sousa", "142856346665", "Sousa", "31995182766", "08011999", "Jose"));

        return listaAlunos;
    }

    @Override
    public Aluno obter(long id) {
        return aluno;
    }

//    public double notaTotal(){
//        aluno.setListaResultados(lista);
//    }

}
