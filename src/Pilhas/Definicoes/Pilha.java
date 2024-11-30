package Pilhas.Definicoes;

import EstruturaMetodosClasses.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }


    /*Para adicionarmos um método de empilhar na pilha

    Vamos fazer o reuso de código, fazendo com que o método empilha
    receba como parametro elemento, e ele vai aproveitar
    o método herdado do adiciona
     */

    public int empilha (T elemento)  {
     super.adiciona(elemento);

        return 0;
    }

    //Verificar o elemento no topo da pilha

    public T topoPIlha(){

        if (this.estavazia()){
            return null;
        }
        //vai retornar o elemento, tirando 1 do topo, se caso der exceção, vai verificar o código acima antes
        return (T) this.elementos[tamanho -1];
    }




    //vamos criar um método agora para desempilhar a pilha

    public T desempilhar(){
        if (this.estavazia()){
            return null;
        }
        //vai remover o elemento, tirando 1 do topo, se caso der exceção, vai verificar o código acima antes
      T elemento = (T) this.elementos[tamanho - 1];
      tamanho--;

      return elemento;
    }
}
