package MeuTesteAPILista;

import ListasEncadeadas.APIListaLincada.MinhaImplementacao.ListaEncadeada;

public class TestandoLista {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionar(1);


        System.out.println("O tamanho da lista é: " + lista.retornarTamanho());
        System.out.println(lista);


        lista.adicionar(2);
        System.out.println("O tamanho da lista é: " + lista.retornarTamanho());
System.out.println(lista);
    }
}
