/*
Escreva um programa, usando filas, que simule a brincadeira da batata quente.
A brincadeira consiste de um grupo de crianças que fica em circulo, sentadas ou em pé.
Uma criança fica fora da roda, de costas ou com os olhos vendados, dizendo a frase:

"Batata quente, quente, quente... queimou!",enquanto isso, os
demais vão passando a bola de mão em mão até ouvirem a palavra "queimou".
Quem estiver com a bola nesse momento sai da roda. Ganha o ultimo que sobrar
 */

package Filas.Exercicios_Praticados_Por_Mim.Exercicio04;

public class Exercicio04 {
    public static void main(String[] args) throws InterruptedException {

JogarBatataQuente jogo = new JogarBatataQuente();
jogo.comecarJogo();
    }
}
