/*

leia 10 numeros, para cada numero lido, verifique e codifique

se o numero for par, empilhe na pilha

se o numero for impar, desempilhe um numero da pilha, caso a pilha estiver vazia, mande uma mensagem

se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos e mostre na tela
 */


package Pilhas.Definicoes.ExerciciosCorrigidos;

import Pilhas.Definicoes.Pilha;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {



        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Entre com um número: ");

            int num = scan.nextInt();


            if (num %2 == 0){ //se resto de divisão for 0, significa que o número é um par!
                System.out.println("Empilhando o número: " + num);
                pilha.empilha(num);
            }
            else{
                Integer desempilhado = pilha.desempilhar();
                if (desempilhado == null){
                    System.out.println("Pilha está vazia!");
                }
                else{
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);

                }
            }
        }
        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estavazia()){
            Integer desempilhado = pilha.desempilhar();
            if (desempilhado == null){
                System.out.println("Pilha está vazia!");
            }
            else{
                System.out.println("desempilhando um elemento da pilha: " + desempilhado);

            }
        }
        System.out.println("Todos os elementos foram desempilhados");
        }

    }

