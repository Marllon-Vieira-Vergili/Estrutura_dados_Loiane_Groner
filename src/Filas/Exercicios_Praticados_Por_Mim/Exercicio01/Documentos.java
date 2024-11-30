package Filas.Exercicios_Praticados_Por_Mim.Exercicio01;

public class Documentos <T> implements Comparable<Documentos> {

    String nome;
    int quantidade_folhas;

    public Documentos(String nome, int quantidade_folhas) {
        this.nome = nome;
        this.quantidade_folhas = quantidade_folhas;
    }
    public Documentos(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade_folhas() {
        return quantidade_folhas;
    }

    public void setQuantidade_folhas(int quantidade_folhas) {
        this.quantidade_folhas = quantidade_folhas;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "nome='" + nome + '\'' +
                ", quantidade_folhas=" + quantidade_folhas +
                '}';
    }

    @Override
    public int compareTo(Documentos outroDocumento) {
        return Integer.compare(this.quantidade_folhas, outroDocumento.quantidade_folhas);
    }
}
