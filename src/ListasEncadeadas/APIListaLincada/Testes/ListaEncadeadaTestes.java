package ListasEncadeadas.APIListaLincada.Testes;

import ListasEncadeadas.APIListaLincada.ListaEncadeada;
import Vetores_e_Arrays.Exercicios.Lista;

public class ListaEncadeadaTestes {
    public static void main(String[] args) {
//testesIniciais();
        //adicionaInicio();

        //removeInicio();

        //removeFinal();

        removePosicao();
    }






    //aqui vamos criar métodos para organizar na hora de testar nossos métodos
    // pra não ficar bagunçado!


    public static void removePosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();



        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);


        System.out.println("Elemento removido: " + lista.removePosicao(0));
        System.out.println("lista" + lista);

        System.out.println("Elemento removido: " + lista.removePosicao(10));
        System.out.println("lista" + lista);
    }

    public static void removeFinal(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();



        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);


        System.out.println("Elemento removido: " + lista.removerFinal());
        System.out.println("lista" + lista);

        System.out.println("Elemento removido: " + lista.removerFinal());
        System.out.println("lista" + lista);
    }

    public static void removeInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        //lista.removerInicio();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);


        System.out.println("Elemento removido: " + lista.removerInicio());
        System.out.println(lista);

    }

    //remover agora do meio da posição





    public static void adicionarPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        //lista.adiciona(5, 0);

        lista.adiciona(0,0);
        lista.adiciona(4,5);
        lista.adiciona(2,3);

        System.out.println(lista);
    }

    public static void adicionaInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }


    public static void testesIniciais(){
        ListaEncadeada<Integer> lista = new ListaEncadeada();

        lista.adiciona(1);

        System.out.println(lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        //lista.limpa();
        //System.out.println(lista);

        System.out.println("BUSCA POR ELEMENTO: ")
        ;        //System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));


        System.out.println("BUSCA POR POSICAO: ");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        //System.out.println(lista.buscaPorPosicao(-1));
        //System.out.println(lista.buscaPorPosicao(4));


        System.out.println(lista.buscaPorPosicao(0));
    }
}
