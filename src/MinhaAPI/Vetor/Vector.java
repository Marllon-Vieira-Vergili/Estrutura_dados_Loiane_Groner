package MinhaAPI.Vetor;

public class Vector <T>{

    public T[] elemento;
    public int tamanho;

    public Vector() {
        this(10); //Capacidade padrão de 10 elementos
    }

    public Vector(int capacidade) {
        this.elemento = (T[]) new Object[capacidade]; //criando o array genérico
        this.tamanho = 0;
    }



    public void adicionarElemento(String elemento){
        if (this.elemento.length == this.tamanho){
            tamanho += elemento.length();

        }
    }


}

