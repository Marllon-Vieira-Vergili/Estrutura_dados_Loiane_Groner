package Vetores_e_Arrays.Exercicios.Executando_Exercicios;

import Vetores_e_Arrays.Exercicios.Lista;

public class Exer04 {
    public static void main(String[] args) throws Exception {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

       System.out.println(lista.obtem(0));
       System.out.println(lista.obtem(2));
       System.out.println(lista.obtem(4));
    }
}
