package io.github.becaErnaneSousa.desafios.pessoas;

public class Diretor extends Pessoa{

    public Diretor(String nome, String cpf, String endereco, String telefone, int dataNascimento) {
        super(nome, cpf, endereco, telefone, dataNascimento);
    }

    public Diretor() {
    }

    public void cadastrarDiretor() {
        Diretor diretor = new Diretor();
    }

    public void consultarDiretor() {

    }

}