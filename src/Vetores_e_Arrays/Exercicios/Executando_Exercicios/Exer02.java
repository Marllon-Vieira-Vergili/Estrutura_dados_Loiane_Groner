package Vetores_e_Arrays.Exercicios.Executando_Exercicios;

import Vetores_e_Arrays.Exercicios.Lista;

import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) throws Exception {


        ArrayList<String> arraylist = new ArrayList<String>(5);
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");

        System.out.println(arraylist.lastIndexOf("A"));

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        System.out.println(lista.ultimoIndice("C"));
    }
}
