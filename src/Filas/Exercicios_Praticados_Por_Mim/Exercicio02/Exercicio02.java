/*
Faça um programa que simule a distribuição de senhas de atendimento a um gupo de pessoas.

Cada pessoa pode receber uma senha prioritária ou uma senha normal. O programa deve obedecer os seguintes critérios:

Existe apenas 1 atendente;

1 pessoa com senha normal, deve ser atendida a cada 3 pessoas com senha prioritária.

Não havendo prioridades, as pessoas com senha normal podem ser atendidas

 */

package Filas.Exercicios_Praticados_Por_Mim.Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) throws InterruptedException {

        Atendente atendente = new Atendente();

        atendente.setSenhaPrioritaria(new Pessoa("João", true)); //é verdade, joão é prioritário
        atendente.setSenhaNormal(new Pessoa("Claudio", false)); //Claudio é falso, ele é novo, nao precisa de prioridade na fila
        atendente.setSenhaPrioritaria(new Pessoa("Josué", false));
        atendente.setSenhaPrioritaria(new Pessoa("Sebastião", true));
        atendente.setSenhaPrioritaria(new Pessoa("Vitor", false));
        atendente.setSenhaPrioritaria(new Pessoa("Carlos Augusto", true));

        atendente.atenderPessoa(); //atende o primeiro, o segundo, e por ai vai
        atendente.atenderPessoa();
        atendente.atenderPessoa();
        atendente.atenderPessoa();
        atendente.atenderPessoa();
        atendente.atenderPessoa();


    }
}
