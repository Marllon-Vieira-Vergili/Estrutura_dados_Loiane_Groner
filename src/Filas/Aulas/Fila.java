package Filas.Aulas;


import EstruturaMetodosClasses.EstruturaEstatica;

public class Fila<T>  extends EstruturaEstatica <T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }


    //Para adicionarmos um método das filas (Queues)

    public void enfileirar(T elemento) {
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;
//ou a gente usa o código pra reusar abaixo,
        this.adiciona(elemento);
    }


    public T espiar() {

        if (this.estavazia()) {
            return null;
        }

        return this.elementos[0];
    }


    //não tem parametro, pois sempre iremos remover o primeiro elemento do vetor
    public T desenfileirar() {

        final int POS = 0;

        if (this.estavazia()) {
            return null;
        }
        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
}