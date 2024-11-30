/*

Usando a classe pilha (durante as aulas) e

-crie uma planilha com capacidade para 20 livros
- insira 6 livros na pilha. Cada livro contém nome, isbn, ano lançamento e autor.
- crie um exemplo para utilizar cada método da classe Pilha


 */

package Pilhas.Definicoes.Exercicios_Praticados_Mim;

import Pilhas.Definicoes.Pilha;

public class Exercicio3 {
    public static void main(String[] args) {


        Pilha<String> livro = new Pilha<>(20);

        livro.empilha("o dia depois de amanhã, 1999, joão da silva");
        livro.empilha("o dia depois de terça, 2000, josé mario");
        livro.empilha("o que eu fui na biguatinga, 2001, marllon");
        livro.empilha("como fiquei milionário na bolsa, 2002, carlinho");
        livro.empilha("como larguei mão do vicio em day trade, 2003, ronaldinho");
        livro.empilha("como lavar a moto que está muito suja, 2004, bueno");

        System.out.println("O livro que está no topo da pilha, é: " + livro.topoPIlha());
        System.out.println("Vou desempilhar um livro, como é pilha, vou retirar o primeiro:  " +  livro.desempilhar());
        System.out.println("O tamanho da biblioteca em livros é de:  " +  livro.tamanho() + " livros");
        System.out.println("A biblioteca de livros está vazia? :  " +  livro.estavazia());


    }
}
