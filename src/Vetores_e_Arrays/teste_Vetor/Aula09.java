package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Classes.Vetor;

public class Aula09 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        vetor.adiciona("H");


        vetor.remove(2);
        System.out.println(vetor);

    }
}