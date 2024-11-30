/*

Faça a torre de hanoi
 */

package Pilhas.Definicoes.ExerciciosCorrigidos;

import java.util.Stack;

public class Exer08 {
    public static void main(String[] args) {


        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();


        original.push(3);
        original.push(2);
        original.push(1);

        torreHanoi(original.size(), original, destino, auxiliar);
    }


    public static void torreHanoi(int n, Stack<Integer> original, Stack < Integer> destino, Stack<Integer> auxiliar){
        //ele será um algoritmo recursivo
        //recursividade precisa de um ponto de para, ou seja, n > 0 ele será executado, ele precisa chamar ele mesmo na recursividade

        if (n > 0){
            torreHanoi(n - 1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("-------");
            System.out.println("Original: " + original);
            System.out.println("destino: " + destino);
            System.out.println("auxiliar " + auxiliar);
            torreHanoi(n-1, auxiliar, destino, original);

        }
    }
}
