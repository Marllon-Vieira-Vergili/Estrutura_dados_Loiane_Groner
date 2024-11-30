/*Conversão decimal - binário

Usando a pilha ou a API stack, faça um algoritmo que irá fazer a conversão de decimais para binário


 */


package Pilhas.Definicoes.Exercicios_Praticados_Mim;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio7 {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<Integer>();

        Scanner sc = new Scanner(System.in); //chamando o scanner para ler elementos de entrada do sistema

        System.out.println("Digite um número para converter em binário: ");
        int n = sc.nextInt();

        //cOndição se o número será 0
        if (n == 0){
            System.out.println("O numero em binário foi 0, saindo...");
            return;
        }

        //Convertendo decimal para binário usando a pilha

        while (n > 0){
                pilha.push( n % 2);
                n = n / 2;

        }

    //Desempilhando os elementos para formar o número binário
        System.out.println("Os números em binário são: ");
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop()); //desempilhando os bits
        }
    }
}
