/*
leia 10 numeros, para cada numero lido, verifique e codifique

se o numero for par, empilhe na pilha

se o numero for impar, desempilhe um numero da pilha, caso a pilha estiver vazia, mande uma mensagem

se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos e mostre na tela
 */


package Pilhas.Definicoes.Exercicios;

import Pilhas.Definicoes.Pilha;

import java.util.Scanner;
import java.util.Stack;


public class Exercicio1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();



//Lendo 10 números
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            try{
            //Se o número for par, vai empilhar na pilha
            if (n % 2 == 0){
                System.out.println("Elemento adicionado! " + pilha.push(n));
                System.out.println(pilha);
            }else{
                if (n % 2 == 1){
                    System.out.println("Removi o elemento: " + pilha.pop());
                }
            }


        } catch (Exception e){
            throw new RuntimeException("A pilha está vazia! Pilha só aceita valores pares!!");
            }
        }

        while (!pilha.isEmpty()){
            pilha.pop();
        }
sc.close();
    }

}

/*
//Lendo 10 números
        for (int i = 0; i < 10; i++) {
int n = sc.nextInt();
//Se o número for par, vai empilhar na pilha
            if (n % 2 == 0){
        System.out.println(pilha.push(n));
        System.out.println(pilha);
            }
 */
