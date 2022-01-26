package io.github.becaErnaneSousa.desafios.entitys.pessoas;

public class Diretor extends Pessoa {

    public Diretor(long id, String nome, String cpf, String endereco, String telefone, String dataNascimento) {
        super(id, nome, cpf, endereco, telefone, dataNascimento);
    }

    public Diretor() {
    }

    public void cadastrarDiretor() {
        Diretor diretor = new Diretor();
    }

    public void consultarDiretor() {

    }

}