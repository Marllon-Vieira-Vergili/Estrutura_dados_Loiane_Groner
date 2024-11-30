/*

Repita o mesmo processo do exercicio anterior, mas agora usando a classe Stack(pilha) da Api do java


 */

package Pilhas.Definicoes.Exercicios_Praticados_Mim;


import java.util.Stack;

public class Exercicio4 {
    public static void main(String[] args) {


        Stack<String> livro = new Stack<String>();


        livro.push("o dia depois de amanhã, 1999, joão da silva");
        livro.push("o dia depois de terça, 2000, josé mario");
        livro.push("o que eu fui na biguatinga, 2001, marllon");
        livro.push("como fiquei milionário na bolsa, 2002, carlinho");
        livro.push("como larguei mão do vicio em day trade, 2003, ronaldinho");
        livro.push("como lavar a moto que está muito suja, 2004, bueno");

        System.out.println("O livro que está no topo da pilha, é: " + livro.firstElement());
        System.out.println("Vou desempilhar um livro, como é pilha, vou retirar o primeiro:  " +  livro.pop());
        System.out.println("O tamanho da biblioteca em livros é de:  " +  livro.size() + " livros");
        System.out.println("A biblioteca de livros está vazia? :  " +  livro.isEmpty());


    }
}