/*
/*

Usando a classe pilha (durante as aulas) e

-crie uma planilha com capacidade para 20 livros
- insira 6 livros na pilha. Cada livro contém nome, isbn, ano lançamento e autor.
- crie um exemplo para utilizar cada método da classe Pilha


 */



package Pilhas.Definicoes.ExerciciosCorrigidos;

import Pilhas.Definicoes.Pilha;

public class Exer03 {
    public static void main(String[] args) {


        Pilha<Livro> pilha = new Pilha<>();

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


        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.estavazia()); //vai retornar false, pois não está vazia!
        System.out.println("Empilhando livros na pilha: ");
        pilha.empilha(livro1);
        pilha.empilha(livro2);
System.out.println("Os livros foram devidamente empilhados!" + pilha.tamanho());
System.out.println(pilha);

System.out.println(" pilha de livros criada, a pilha, está vazia?" + pilha.estavazia());

System.out.println("Espiando o topo da pilha: " + pilha.topoPIlha());

while (!pilha.estavazia()){
    System.out.println("Desempilhando livro..." + pilha.desempilhar());
}
System.out.println("Todos os livros foram desempilhados " + pilha.estavazia());
    }
}
