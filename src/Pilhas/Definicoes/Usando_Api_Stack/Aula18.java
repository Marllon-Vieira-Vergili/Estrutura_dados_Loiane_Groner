package Pilhas.Definicoes.Usando_Api_Stack;

import Pilhas.Definicoes.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {

       // Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(8);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
