package Vetores_e_Arrays.Classes;

import EstruturaMetodosClasses.EstruturaEstatica;

//Classe criada apenas para mostrar o refactoring

public class Lista2<T> extends EstruturaEstatica {

    public Lista2(){
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }


    public boolean adiciona(Object elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, Object elemento){
        return super.adiciona(posicao, elemento);
    }

}
