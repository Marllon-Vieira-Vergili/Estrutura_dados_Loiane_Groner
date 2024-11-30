package Pilhas.Definicoes.ExerciciosCorrigidos;

import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
    }

    public static void imprimeResultado ( String palavra){

        System.out.println(palavra + " é palíndromo? " + palindromo(palavra));
    }

    public static boolean palindromo(String palavra){

        Stack<Character> pilha = new Stack<>();


        //estamos empilhando todos os caracteres, primeiramente
        for (int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()){
            palavraInversa += pilha.pop();
        }

        if (palavra.equalsIgnoreCase(palavra)){
            return true;
        }
        return false;

    }
}
