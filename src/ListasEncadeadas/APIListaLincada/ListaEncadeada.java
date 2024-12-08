package ListasEncadeadas.APIListaLincada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe";
    private final String LISTA_VAZIA = "Lista está vazia";


    public void adiciona(T elemento) {
        //Instanciou um elemento genérico da classe nó que chama celular, e passou como parametro o elemento
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }





    //agora vamos criar os métods de remover da lista
    //primeiro o método de remover do inicio da lista!

        //posso retornar como boolean, como void, ou como retornar o elemento que foi removido (T)
    public T removerInicio(){
        if (this.tamanho == 0){
            throw new RuntimeException("Lista está vazia!");
        }
        //se passou desse if, temos elemento na nossa lista
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0){
            this.ultimo = null;
        }
        return removido;
    }

    //vamos agora fazer o algoritmo para remover um elemento do final da lista

    public T removerFinal(){
        //vamos fazer os cenários
        if (this.tamanho == 0){
            throw new RuntimeException(LISTA_VAZIA);
        }
        if (this.tamanho == 1){
            return this.removerInicio();
        }
        //agora para remover o elemento do final da lista
        No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo((null));
        this.ultimo = penultimoNo;
        this.tamanho--;
        return removido;
    }

    private boolean posicaoNaoExiste(int posicao){
        return !(posicao >= 0 && posicao <= this.tamanho);
    }

    public T removePosicao(int posicao){
        if (this.posicaoNaoExiste(posicao)){
        throw new IllegalArgumentException(NAO_EXISTE);
        }

        if (posicao == 0){
            return this.removerInicio();
        }
        if (posicao == this.tamanho - 1){ //ou seja, queremos remover o ultimo elemento
            return this.removerFinal();
        }
        // agora e se quisermos remover o do meio?? vamos fazer a lógica pra ele agora!!
        No<T> noAnterior = this.buscaNo(posicao -1);
        // depois de sabermos quem é o nó anterior, precisamos ver qual
        // vai ser o que queremos remover atualmente, que chamaremos de atual
        No<T> atual = noAnterior.getProximo();
        No<T> proximoNo = atual.getProximo();
        noAnterior.setProximo(proximoNo);
        atual.setProximo(null);
        this.tamanho--;
        return null;
    }



    public void adicionaInicio (T elemento){
        if (this.tamanho == 0){
            No <T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else{
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }

    //Vamos fazer um método agora para adicionar em qualquer lugar da lista
    //pois o primeiro, sempre vai adicionar no final.

    public void adiciona(int posicao, T elemento){
        //vamos utilizar 3 cenários


        //aqui é só uma condição se o usuário digitar uma posicao inválida
        if (posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        //o primeiro, é se a lista está vazia!
        if (posicao == 0 || inicio == null){
        this.adicionaInicio(elemento);

        }
        //vamos verificar agora se a posição é igual ao tamanho da lista
        else if (posicao == this.tamanho){ //se a posicao for igual ao tamanho, quero só adicionar no ultimo elemento, entao só chamo o método adiciona
            this.adiciona(elemento);

            //então, se não é no inicio que queremos adicionar, nem no final, entao será em outro lugar
        } else{ // adicionar no meio
            //primeiro temos que buscar a posição, reutilizando a lógica do busca nó, falando que é um nó anterior, fazendo uma referencia
            No<T> noAnterior = this.buscaNo(posicao);
            //agora, vamos criar outra referencia,  o próximo nó do lado, e vamos chamar o método nó anterior, e pegar o próximo nó
            No<T> proximoNo = noAnterior.getProximo();
            //agora, vou criar um novo elemento, e criar uma lógica pra ele adicionar no meio desses 2 elementos!
            No<T> novoNo = new No<>(elemento, proximoNo); //passando o próximo nó como parâmetro
            //o próximo nó, deopis do nó anterior, vai ser adicionado no novo nó, para não quebrar a referência
            novoNo.setProximo(proximoNo);
            //e o novo nó também vai ser adicionado ao novo nó, para não quebrar  a referência dos nós anteriores
            noAnterior.setProximo(novoNo);
            //e incrementa o tamanho
            this.tamanho++;
        }
    }


    public int getTamanho() {
        return this.tamanho;
    }


    public void limpa() {

        //um método mais completo, que vai percorrer todo elemento, e ajudar o garbage collector do java

        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        //depois que sai e acaba o for, todos os atributos ficam nulos!


        //mas se eu quiser só atribuir nulo a todos, da também!
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    //métodos de buscar por elemento ou posição na lista

    private No<T> buscaNo(int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }

        No<T> noAtual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {

        No<T> noAtual = this.inicio;
        int pos = 0;
        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }

        return NAO_ENCONTRADO;

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
        No<T> atual = this.inicio;
        //vamos parar no penultimo elemento da lista, pelo tamanho -1
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /*
        builder.append(atual.getElemento()).append( ",");

        while(atual.getProximo() != null){
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");

        }
        /*
         */

        return builder.toString();
    }
}
