/*
/*

escreva um programa que leia 10 numeros. para cada número lido, verifique e codifique de acordo
com as regras a seguir:

se o numero for par, empilhe na pilha chamada par;

se for impar, empilhe na pilha chamada impar;

Se o numero for zero (0), desempilhe um elemento de cada pilha.
caso alguma pilha esteje vazia, mostre uma mensagem de erro na tela

ao final do programa, desempilhe todos os elementos das duas pilhas, imprimindo-os na tela

 */

package Pilhas.Definicoes.Exercicios_Praticados_Mim;



import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();


        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();


            if (n == 0) {
                if (par.isEmpty() || impar.isEmpty()) {
                    throw new RuntimeException("Uma das pilhas está vazia!");
                } else {

                    par.pop();
                    System.out.println("Desempilhando um valor do par!");
                    impar.pop();
                    System.out.println("Desempilhando um valor do ímpar!");
                }
            }

            if (n % 2 == 0) {
                par.push(n);
                System.out.println("Empilhando elemento dentro do vetor par!" + n);
                System.out.println("Elementos do vetor par: " + n);
            }
            if (n % 2 == 1) {
                impar.push(n);
                System.out.println("Empilhando elemento dentro do vetor impar!" + n);
                System.out.println("Elementos do vetor impar: " + n);
            }
            System.out.println("Desempilhando e imprimindo valores da pilha par: ");
            while (!par.isEmpty()) {
                System.out.println(par.pop());
            }

            System.out.println("Desempilhando e imprimindo valores da pilha ímpar!: ");
            while (!impar.isEmpty()) {
                System.out.println(impar.pop());
            }



        }
        sc.close();
    }
}

