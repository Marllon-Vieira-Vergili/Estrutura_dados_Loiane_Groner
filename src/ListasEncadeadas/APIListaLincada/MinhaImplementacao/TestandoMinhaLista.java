package ListasEncadeadas.APIListaLincada.MinhaImplementacao;

public class TestandoMinhaLista {
    public static void main(String[] args) {


        ListaEncadeada <Integer> lista = new ListaEncadeada<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println(lista);

        System.out.println("BUSCA POR ELEMENTO: ");
        //System.out.println(lista.busca(0));
        System.out.println(lista.buscaElemento(1));
        System.out.println(lista.buscaElemento(2));
        System.out.println(lista.buscaElemento(3));
        System.out.println(lista.buscaElemento(4));
    }
}
