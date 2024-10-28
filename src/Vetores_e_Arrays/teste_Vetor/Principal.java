package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Vetor;

public class Principal {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");

        //System.out.println(vetor.tamanho());
        //System.out.println(vetor.toString());
        //System.out.println(vetor.busca(3));
        System.out.println(vetor.busca("elemento 100"));
    }
}
