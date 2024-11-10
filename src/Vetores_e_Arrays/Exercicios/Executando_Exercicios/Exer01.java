package Vetores_e_Arrays.Exercicios.Executando_Exercicios;

import Vetores_e_Arrays.Exercicios.Lista;

import java.io.StringBufferInputStream;

public class Exer01 {
    public static void main(String[] args) throws Exception {


        Lista <String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C"));
        System.out.println(lista.contem("E"));

    }
}
