package ListasEncadeadas.APIListaLincada.MinhaImplementacao;


import ListasEncadeadas.APIListaLincada.No;

public class ListaEncadeada <T> {


    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho = 0;

    private final int ELEMENTO_NAO_ENCONTRADO = -1;

    public void adicionar(T elemento) {
        No<T> novoNo = new No<>(elemento);

        //se eu quiser inserir outro elemento no final
        if (this.tamanho == 0) {
            this.primeiro = novoNo;

        } else {
            this.ultimo.setProximo(novoNo);
        }
        this.ultimo = novoNo;
        tamanho++;
    }

    public int retornarTamanho() {
        return this.tamanho;
    }


    public void limparTodosElementos() {

        //criar uma instancia de nó chamada atual, que vai receber o primeiro valor, e a condição é que atual tem que ser diferente de null
        for (No<T> atual = this.primeiro; atual != null; ) {
            //se for diferente de nulo, eu vou instanciar outra lista de nó secundário, que vai receber o próximo elemento da lista atual;
            No<T> secundario = atual.getProximo();
            //vou setar os elementos da atual para nulo
            atual.setElemento(null);
            //e da secundária também
            secundario.setElemento(null);
            //e vou falar que a variável atual vai receber os valores da secundária
            atual = secundario;
        }
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }


    //Vou fazer os métodos de busca na lista


    private No<T> buscarNo(int posicao){

     if (!(posicao >= 0 && posicao <= this.tamanho)){
            throw new IllegalArgumentException("Posição não foi encontrado!");
        }

     No<T> atual = this.primeiro;

     for (int i = 0; i < posicao; i++){
         atual = atual.getProximo();
     }
     return atual;
    }

    public T buscarPosicao(int posicao){
        return this.buscarNo(posicao).getElemento();
    }


    public int buscaElemento(T elemento) {


        No<T> atual = this.primeiro;
        int posicao = 0;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao++;
            atual = atual.getProximo();
        }
        return ELEMENTO_NAO_ENCONTRADO;
    }






    //String formatada para percorrer a lista
    @Override
    public String toString() {

        //[1, 2, 3, 4]

        //se a lista ja estiver vazia, retorna os colchetes do vetor vazio!
        if (this.tamanho == 0) {
            return "[]";
        }
        //Vamos instanciar o Stringbuilder
        StringBuilder builder = new StringBuilder("[");

        // a nossa variável atual, vai receceber o inicio, pois vai comecar de algum lugar, 0;
        No<T> atual = this.primeiro;
        //vamos parar no penultimo elemento da lista, pelo tamanho -1
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }


}




    /*

    a que to tentando implementar

    //Vou fazer uma formatação de String para percorrer a lista e formatar os elementos melhores
    @Override

    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.primeiro;


        while (atual != null) {
            builder.append(atual.getElemento()); //vou adicionar o elemento atual
            builder.append(",");
        }
        atual = atual.getProximo(); //move para o pórixmo nó

        return builder.toString();
    }
}
*/
