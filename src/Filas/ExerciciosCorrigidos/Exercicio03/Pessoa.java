package Filas.ExerciciosCorrigidos.Exercicio03;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int prioridade;

    public Pessoa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        if (prioridade > outraPessoa.prioridade) {
            return 1;
        } else if (prioridade < outraPessoa.prioridade) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}

