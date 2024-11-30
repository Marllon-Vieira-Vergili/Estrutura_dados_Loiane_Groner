/*

Desafio torre de Hanoi
 */

package Pilhas.Definicoes.Exercicios_Praticados_Mim;



import java.util.Stack;

public class Exercicio8 {
    public static void main(String[] args) {

      Stack<Integer> auxiliar = new Stack<Integer>();
      Stack <Integer> original = new Stack<Integer>();
      Stack<Integer> destino = new Stack<Integer>();

      original.push(3);
      original.push(2);
      original.push(1);


torredeHanoi(original.size(), original, destino, auxiliar);

    }


//aqui, a gente vai receber o disco, no caso o valor dele, vai ler primeiro do origianl, vai passar o maior valor pro destino, e o menor para o auxliar

    public static void torredeHanoi(int disco, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar){


        if (disco > 0 ){
            torredeHanoi(disco - 1, original, auxiliar, destino ); //aqui é o começo da recursão
            //vou tirar um disco, do original, vou passar para a torre auxiliar, e mandar para a torre destino

            destino.push(original.pop()); //ele vai adicionar o elemento pro destino, e desempilhar da torre original
            System.out.println("--------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torredeHanoi(disco -1, auxiliar, destino, original); //aqui é o fim da recursão, ou seja, ele vai voltar
            /*aqui é o contrário, ou seja, vou tirar um disco do auxiliar, vou mandar pro destino, e ele vai voltar
            pro original, na qual o original agora será a torre principal, pois foi empilhado certinho com o valor
            maior para o menor
             */

        }
    }
}
