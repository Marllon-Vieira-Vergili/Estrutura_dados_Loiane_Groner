package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Classes.Vetor;

public class Aula04 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}