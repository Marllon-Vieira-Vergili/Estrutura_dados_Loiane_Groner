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
package Pilhas.Definicoes.Exercicios_Praticados_Mim;

import Pilhas.Definicoes.Pilha;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pilha<String> pilha = new Pilha<>();

        System.out.println("digite a expressão matemática: ");
        String caracter = sc.nextLine();


        //percorrer a expressão da esquerda para direita, caractere por caractere
        for (int i = 0; i < caracter.length(); i++) {
            char c = caracter.charAt(i); //vai obter o caractere na posição do i

            if (c == '(') {
                pilha.empilha("("); //vou empilhar o elemento de abertura
            } else if (c == ')') {
                //se o caracter iniciar com parentesis fechado, e sem dados, ele vai retornar esse if
                if (pilha.estavazia()) {
                    //se a pilha estiver vazia, significará que temos um parêntese de fechamento sem valor correspondente
                    System.out.println("Erro: parêntese de fechamento sem correspondente de abertura");
                    return;
                }
                pilha.desempilhar(); //desempilhando parêntesis de fechamento
            }
        }
//Se ainda houver elementos na pilha, significa que temos parênteses de abertura sem fechamento

        if (!pilha.estavazia()) {
            System.out.println("Expressão possui elemento de abertura sem fechamento, está com erro!");
        } else {
            System.out.println("Expressão está correta!");
        }
        sc.close();
    }

}


