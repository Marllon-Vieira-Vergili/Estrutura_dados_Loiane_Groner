/*
/*

faça o mesmo do exercicio 3, usando a a API stack java


 */



package Pilhas.Definicoes.ExerciciosCorrigidos;

import Pilhas.Definicoes.Pilha;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {


        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Aprendendo java e estrutura de dados");
        livro1.setAnolancamento(2016);
        livro1.setAutor("Loiane Groner");
        livro1.setIsbn("B25254DE");

        Livro livro2 = new Livro();
        livro2.setNome("Aprendendo orientação a objetos e java");
        livro2.setAnolancamento(1997);
        livro2.setAutor("Marllon");
        livro2.setIsbn("1b3d5f89");


        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.isEmpty()); //vai retornar false, pois não está vazia!
        System.out.println("Empilhando livros na pilha: ");
        pilha.push(livro1);
        pilha.push(livro2);
        System.out.println("Os livros foram devidamente empilhados!" + pilha.size());
        System.out.println(pilha);

        System.out.println(" pilha de livros criada, a pilha, está vazia?" + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro..." + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados " + pilha.isEmpty());
    }
}
