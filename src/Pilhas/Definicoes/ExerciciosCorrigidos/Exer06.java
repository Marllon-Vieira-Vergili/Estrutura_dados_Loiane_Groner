/*
/*
Escreva um programa para verificar se uma expressão matemática tem os parêntesis agrupados
de forma correta, isto é:

1) se o número de parênteses a esquerda e a direita são iguais e;
2) se todo parentese aberto é seguido posteriormente por um fechamento de parêntese

veja exemplos:

As expressões ((A + B) ou A + B (violam a condição 1)
As expressões )A+B(-C ou (A+B) - (C + D violam a condição 2
A expressão ((A+B)+D) está ok.

 */


package Pilhas.Definicoes.ExerciciosCorrigidos;

import Pilhas.Definicoes.Pilha;

public class Exer06 {
    public static void main(String[] args) {

imprimeResultado("A + B");
imprimeResultado("A + B (C  - D)");
    }

    public static void imprimeResultado(String expressao){
        System.out.println(expressao + " está balanceado?" +
                verificarSImbolosbalanceados(expressao));
    }

    //vamos criar uma constante, final

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificarSImbolosbalanceados(String expressao){

        boolean balanceado = true;
        Pilha <Character> pilha = new Pilha<Character>();
        int index = 0;
        char simbolo,topo;

        while (index < expressao.length()){
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);
            }
            else{
                if (FECHA.indexOf(simbolo) > -1 ){
                    if (pilha.estavazia()){
                        return false;
                    }else{
                       topo = pilha.desempilhar();

                       if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                           return false;
                       }
                    }
                }
            }
            index++;
        }
        return true;

    }
}
