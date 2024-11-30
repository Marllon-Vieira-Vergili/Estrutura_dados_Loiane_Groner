package Filas.Exercicios_Praticados_Por_Mim.Exercicio03;

public class Pessoa  {

    String nome;
    String prioridade;

    public Pessoa(String nome, String prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }



    public String getPrioridade() {
        return prioridade;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
