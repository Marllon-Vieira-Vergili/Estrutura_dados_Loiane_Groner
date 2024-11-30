package Pilhas.Definicoes.Exercicios_Praticados_Mim;

import java.util.Stack;



//usando lógica de torre de hanoi
public class recursividade {
    public static void main(String[] args) {


        Stack<Integer> auxiliar = new Stack<Integer>();
        Stack <Integer> original = new Stack<Integer>();
        Stack<Integer> destino = new Stack<Integer>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

       torreHanoi(original.size(), original, destino, auxiliar);
    }

  public static void torreHanoi(int tamanhodisco, Stack<Integer> original, Stack<Integer> destino, Stack <Integer> auxiliar){


        if (tamanhodisco > 0){
            torreHanoi(tamanhodisco - 1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("-------------");
            System.out.println("Original: " + original);
            System.out.println("Auxiliar: " + auxiliar);
            System.out.println("Destino: " + destino);


            torreHanoi(tamanhodisco - 1, auxiliar, destino, original);

        }
  }
}
