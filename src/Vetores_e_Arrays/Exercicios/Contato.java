package Vetores_e_Arrays.Exercicios;

public class Contato <T> extends Array {


    private T nome;
    private T telefone;
    private T email;

    public Contato (){}


    public Contato(T nome, T telefone, T email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public T getTelefone() {
        return telefone;
    }

    public void setTelefone(T telefone) {
        this.telefone = telefone;
    }

    public T getEmail() {
        return email;
    }

    public void setEmail(T email) {
        this.email = email;
    }
}
