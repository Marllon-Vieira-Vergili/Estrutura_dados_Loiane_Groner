package Pilhas.Definicoes.ExerciciosCorrigidos;

import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
imprimeResultado(1001);
imprimeResultado(190);
imprimeResultado(10035);
    }


    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static String decimalBinario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numerobinario = "";
        int resto;

        while (numero > 0){
            resto = numero % 2;
pilha.push(resto);
numero = numero /2; //numero = numero % 2

        }

        while (!pilha.isEmpty()){
            numerobinario += pilha.pop();

        }


        return numerobinario;
    }
}
