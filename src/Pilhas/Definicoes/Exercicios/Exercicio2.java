/*

escreva um programa que leia 10 numeros. para cada número lido, verifique e codifique de acordo
com as regras a seguir:

se o numero for par, empilhe na pilha chamada par;

se for impar, empilhe na pilha chamada impar;

Se o numero for zero (0), desempilhe um elemento de cada pilha.
caso alguma pilha esteje vazia, mostre uma mensagem de erro na tela

ao final do programa, desempilhe todos os elementos das duas pilhas, imprimindo-os na tela
 */

package Pilhas.Definicoes.Exercicios;

import Pilhas.Definicoes.Pilha;
import org.w3c.dom.xpath.XPathResult;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            pilha.empilha(n);
            System.out.println(pilha);

            if (n % 2 == 0) {
                Pilha<Integer> par = new Pilha<Integer>();
                if (par.estavazia() != par.estavazia()) {
                    par.empilha(n);
                    System.out.println("Empilhando em um vetor par!" + par);

                    //Condição se o usuário digitar um 0 na pilha de par
                    if (n == 0){
                        par.desempilhar();
                        System.out.println("Desempilhando um elemento da pilha" + par);
                    }
                }
            }
              else{
                if (n % 2 == 1) {
                    Pilha<Integer> impar = new Pilha<Integer>();
                    if (impar.estavazia() != impar.estavazia()) {
                        impar.empilha(n);
                        System.out.println("Empilhando em um vetor impar!" + impar);

                        if ( n == 0){
                            impar.desempilhar();
                            System.out.println("Desempilhando um elemento da pilha" + impar);
                        }

                    }

                }

            }


                }
            sc.close();
            }

        }





    /*
    public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0;  i < 10; i++){
            int n = sc.nextInt();
            pilha.empilha(n);
            System.out.println(pilha);

            if (n % 2 == 0){

                int par = n;
                pilha.empilha(par);
                System.out.println("Empilhando em um vetor par!" + par);
                }

            else{
                if (n % 2 == 1){
                    int impar = n;
                    pilha.empilha(impar);
                    System.out.println("Empilhando em um vetor ímpar!" + impar);
                }
             }


            }
        sc.close();
        }
    }
     */