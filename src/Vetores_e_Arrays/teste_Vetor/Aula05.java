package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Vetor;

public class Aula05 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); //0
        vetor.adiciona("elemento 2"); //1
        vetor.adiciona("elemento 3"); //2

        System.out.println(vetor.busca(3));
    }
}