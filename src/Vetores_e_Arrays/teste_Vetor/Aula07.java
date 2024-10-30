package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Classes.Vetor;

public class Aula07 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
        vetor.adiciona(0, "A");
        System.out.println(vetor);

    }
}