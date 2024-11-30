package Filas.Aulas;

public class Paciente implements Comparable <Paciente> {
    public String nome;
    public int prioridade;


    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }
    public Paciente(){}

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

    //vamos supor que quero dar prioridade pro paciente na fila (queue)


    /**
     * @param outropaciente the object to be compared.
     * @return
     */
    @Override
    public int compareTo( Paciente outropaciente) {

            /*
    Interface comparable, como o java faz?


    se o obj1 > obj2 o java retorna > 0 ou seja, ele retorna (1)
    se o obj1 < obj2, o java retorna valoe < 0, ou seja, ele retorna (-1)

    se for igual, ele retorna 0;
     */

        if (this.prioridade > outropaciente.getPrioridade()){
            return 1;
        } else if (this.prioridade < outropaciente.getPrioridade()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
