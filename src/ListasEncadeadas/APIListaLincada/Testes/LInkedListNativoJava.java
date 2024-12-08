package ListasEncadeadas.APIListaLincada.Testes;

import ListasEncadeadas.APIListaLincada.ListaEncadeada;

import java.util.LinkedList;

public class LInkedListNativoJava {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);

        lista.add(2,2);

        System.out.println(lista);

        lista.remove();
        System.out.println(lista);

        lista.remove(0);

        System.out.println(lista);

        lista.removeFirst();
        lista.removeLast();
    }





}
