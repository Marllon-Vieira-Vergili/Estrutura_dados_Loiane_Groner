/*


escreva um programa que leia 10 numeros. para cada número lido, verifique e codifique de acordo
com as regras a seguir:

se o numero for par, empilhe na pilha chamada par;

se for impar, empilhe na pilha chamada impar;

Se o numero for zero (0), desempilhe um elemento de cada pilha.
caso alguma pilha esteje vazia, mostre uma mensagem de erro na tela

ao final do programa, desempilhe todos os elementos das duas pilhas, imprimindo-os na tela

 */


package Pilhas.Definicoes.ExerciciosCorrigidos;

import Pilhas.Definicoes.Pilha;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        //percorrer um scanner que vai pedir para o usuário digitar até 10 elementos
        int numero = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um número: ");
            numero = scan.nextInt();
            Integer desempilhado;

            //pilha par e impar, mas dentro da condição, se forem igual a 0, vai fazer algo antes
            if (numero == 0) {

                desempilhado = par.desempilhar();
                if (desempilhado == null) {
                    System.out.println("Pilha par vazia!");
                } else {
                    System.err.println("Desempilhando da pilha par: ");
                }

                //pilha impar
                desempilhado = impar.desempilhar();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia!");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + desempilhado);
                }

            }

            else if (numero % 2 == 0) {
                System.out.println("Empilhando na pilha par: " + numero);
                par.empilha(numero);
            } else {
                System.out.println("Empilhando na pilha impar: " + numero);
                impar.empilha(numero);
            }
        }

        System.out.println("Desempilhando todos os números da pilha par");

        while (!par.estavazia()) {
            System.out.println("desempilhando da pilha par: " + par.desempilhar());
        }
        while (!impar.estavazia()) {
            System.out.println("desempilhando da pilha impar: " + impar.desempilhar());
            }
        }
    }



