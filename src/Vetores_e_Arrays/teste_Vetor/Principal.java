package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Vetor;

public class Principal {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        vetor.adiciona("H");

        System.out.println(vetor);


/*
       vetor.adiciona(0, "A");
       vetor.adiciona( 1, "B");
        vetor.adiciona( 2, "C");
        vetor.adiciona( 3, "D");
        vetor.adiciona( 4, "E");
        vetor.adiciona( 5, "F");
        vetor.adiciona( 5, "G");
*/

        //System.out.println(vetor.tamanho());
        //System.out.println(vetor.toString());
        //System.out.println(vetor.busca(3));
        //System.out.println(vetor.busca("elemento 100"));
    }
}
