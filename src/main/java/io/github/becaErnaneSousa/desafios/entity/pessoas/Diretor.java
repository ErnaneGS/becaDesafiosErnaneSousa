package io.github.becaErnaneSousa.desafios.entity.pessoas;

public class Diretor extends Pessoa {

    public Diretor(String nome, String cpf, String endereco, String telefone, String dataNascimento) {
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