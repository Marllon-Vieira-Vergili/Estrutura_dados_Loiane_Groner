/*
A lógica para implementar uma lista encadeada em Java envolve o uso de nós que contêm os dados e referências (ponteiros)
 para outros nós. Vamos passar pelas etapas principais que você seguiria para construir a estrutura de dados de uma
 lista encadeada, sem usar código, mas apenas explicando o processo e os conceitos envolvidos.
1. Estrutura do Nó (Node)

A base de uma lista encadeada é o nó. Cada nó contém:

    Dados: Pode ser qualquer tipo de informação (números, strings, objetos, etc.).

    Referência/ponteiro para o próximo nó: Aponta para o próximo nó na lista. O último nó terá um ponteiro que será
    null, indicando que não há mais nós na lista.
 */


package ListasEncadeadas.APIListaLincada;

public class No <T>{

    //O nó vai receber um atributo para receber um elemento do tipo genérico
   private T elemento;
   //e um atributo que vai apontar para o próximo nó, que vai receber um tipo genérico da classe nó
   private No<T> proximo;


   //Um construtor para receber somente o elemento do nó, pois o próximo, quando não tiver elemento, ele será nulo
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}

