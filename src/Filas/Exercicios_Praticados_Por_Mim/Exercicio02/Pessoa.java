package Filas.Exercicios_Praticados_Por_Mim.Exercicio02;

public class Pessoa  implements Comparable<Pessoa> {


    String nomePessoa;
    boolean isPrioritaria;

    public Pessoa(String nomePessoa, boolean isPrioritaria) {
        this.nomePessoa = nomePessoa;
        this.isPrioritaria = isPrioritaria;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public boolean isPrioritaria() {
        return isPrioritaria;
    }

    public void setPrioritaria(boolean prioritaria) {
        isPrioritaria = prioritaria;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", Senha Prioritária = " + isPrioritaria +
                '}';
    }



    @Override
    public int compareTo(Pessoa pessoa) {
        return 0;
    }
}
