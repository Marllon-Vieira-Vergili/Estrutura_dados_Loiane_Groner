package Pilhas.Definicoes;

import EstruturaMetodosClasses.EstruturaEstatica;

public class Aula17  {
    public static void main(String[] args) {


        Pilha<Integer> pilha = new Pilha<>();

        pilha.adiciona(20);
        pilha.adiciona(30);

        System.out.println(pilha);

        System.out.println("desempilhando elemento da pilha: " + pilha.desempilhar());
        System.out.println(pilha);
    }
}
