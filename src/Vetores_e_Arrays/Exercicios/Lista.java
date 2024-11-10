package Vetores_e_Arrays.Exercicios;

/*

Vetores (Arrays): introdução

Classe Vector
 - Definição:
 - Adicionar elemento final no vetor
 - Verificar quantidade de elementos no vetor
 - imprimir elementos do vetor
 - Obter elemento de uma posição
 - Verificar se elemento existe no vetor
 - Adicionar elemento em qualquer posição
 - Adicionar mais capacidade ao vetor
 - Remover elemento do vetor
  - Generalizar o tipo dos elementos
   - Definindo o tipo do vetor dinamicamente
    - API Java Vetor List
    - Exercícios

 */





/*
Um vetor (array) é a estrutura de dados mais
simples que existe.

Um vetor armanzena uma sequeência de valores onde todos
são do mesmo tipo
 */

import java.lang.reflect.Array;

//Agora a classe Lista é um tipo Genérico, ou seja, podemos escolher o tipo de dados que quisermos para instanciarmos!
public class Lista<T> {

    private T[] elementos;
    private int tamanho = 0;

    //Criando o construtor com a capacidade que eu quero criar

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Ou pode usar o construtor dessa forma, mas a primeira é mais facil entender

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) throws Exception {


        //se precisar, esse método vai aumentar a capacidade, chamando o metodo aumentacapacidade
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    /*Vamos fazer um Overload, ou seja, sobrecarregar o método adiciona
    para que possamos inserir algum elemento, em qualquer
    posição do vetor.

     */
    //Vou passar no método adiciona, um parametro que vai receber uma posicao, e um elemento

    public boolean adiciona(int posicao, T elemento){

        //Ja vamos aproveitar o algoritmo do método de busca abaixo
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Você digitou uma posição invalida!");
        }

        //se precisar, esse método vai aumentar a capacidade, chamando o método aumentacapacidade
        this.aumentaCapacidade();

        //Vamos focar na lógica agora, para criar o algoritmo de mover os elementos

        //o nosso for, vai começar iterando o i, até o tamanho, o i vai ser maior ou igual a posição, e vamos decrementa
        //Mover (empurrar) todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;


        return true;
    }

//Vamos fazer o método para remover algum elemento do VETOR!

    /*
    Como vamos remover um elemento de uma posição, ele não precisa retornar nada
    e vamos inserir o parametro da posicao do vetor
     */


    //B D E F F -> posição a ser removida é 1 (G)
    //0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao){
        //Ja vamos aproveitar o algoritmo do método de busca abaixo
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Você digitou uma posição invalida!");
        }
        //Vamos fazer um for, para "Empurrar" os elementos, como se fosse no diagrama visual
        /*
        Os nossos elemento, vai receber a posicao como parametro, i vai ser menor que o
        tamanho menos 1, e depois vamos iterar com ++
         */
        for (int i = posicao; i< this.tamanho-1;i++){
            /*
            Os nossos elementos vai receber alguma outra posição
            também do vetor de elementos, da posição i, e vai adicionar mais 1
             do caso i + 1

             */
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(T elemento){
        //vamos aproveitar o algoritmo do método de busca
        int pos = this.busca(elemento);
        //se o atributo pos retornar -1, sinal que nao encontrou.. se a posicao retornar maior que 1, encontrou elemento
        if (pos >  - 1 ){
            this.remove(pos);
        }
    }

    
    //Método para limpar todos os elementos do vetor
    
    public void limpar(){
        // Opção 1
        this.elementos = (T[]) new Object[this.elementos.length];
        //Opção 2
        this.tamanho = 0;
        //Opção 3
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }


    //Método para aumentar capacidade do vetor, sem passar nenhum parametro

    private void aumentaCapacidade(){
        /*
        Como iremos adicionar a capacidade?
        sempre que o tamanho do vetor, for igual ao length do vetor, que é a capacidade que o vetor tem

         */

        if (this.tamanho == this.elementos.length){
            //iremos criar outro vetor, do tipo string
            T [] elementosNovos = (T[]) new Object[this.elementos.length  * 2];
            for (int i=0; i < elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            //atribuindo o novo vetor, ao vetor
            this.elementos = elementosNovos;
        }

    }



    //Método para obter um elemento de uma determinada posição

    /*
    Mas.. se o usuário buscar algum elemento em um campo
    que nao tem nenhum dado, necessitamos fazer um tratamento.


     */


    //Criando método obter posicao
    public T obtem(int posicao) {
        return this.busca(posicao);
    }



    public T busca(int posicao){
        //se a posicao >-= 0 e posicao for menor que o tamanho, negando ela
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Você digitou uma posição invalida!");

        } else{
            return this.elementos[posicao];
        }

    }

    /*Método para verificar se o elemento existe no vetor,
    utilizando o método boolean

     */


    public int busca(T elemento){
        //Para buscar, vamos iterar até o tamanho real do vetor
        //Mesmo nós sabemos, que tem muito mais espaço disponível
        for (int i = 0; i < this.tamanho; i++){

            /*
            Se a posição do vetor que é elementos de i for igual a do elemento que estamos procurando
             */

            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


    //Implementando método último índice

    public int ultimoIndice(T elemento){

        int ultimaPos = -1;
        //vamos iterar ao contrário no for, de trás para frente

        //tamanho -1, pois nosso vetor vai de 0 até tantos, sem verficar o tamanho
        for (int i  = this.tamanho - 1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)){
               return i;
            }

        /*
        esse iria percorrer todo o array, do começo ao fim,
        imagina se tivessemos uns 100 mil elementos no vetor
        ele iria percorrer todo o vetor pra achar o último índice?

        for (int i  = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                ultimaPos = i;
            }
            */

        }

        //se o elemento não existir, retornar -1;
        return ultimaPos;
    }





    //Implementando o método Contém
    public boolean contem (T elemento){
        /*
        int pos = busca(elemento);
        if (pos > -1){
            return true;
        }
        return false;*/
        return busca(elemento) < -1;
        
    }


    //Método para retornar o tamanho
    public int tamanho(){
        return this.tamanho;
    }


    /*
    Vamos fazer um toString formadado, para aparecer
    apenas os campos preenchidos
     */
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");


        for (int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }


}


















//Ou podemos verificar se irá passar o limite do vetor, dessa forma ao inves de booleano

    /*
    public void adiciona(String elemento) throws Exception{

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

        else{
            throw new Exception("Vetor ja está cheio, não é possível adicionar mais elementos");
        }

     */





        /*


        Método que não vai retornar nada, que vai receber um método de adição


        public void adicionar(String elemento){


            Para adicionarmos elementos, como a posição
            vazia em uma String é Null, vamos percorre-la
            para encontrar uma posição vazia e adicionar o elemento!

            Se fosse uma vetor de boolean, os valores iniciariam como "false"
            se fosse int, os valores se iniciariam como "0"


            Aqui percorremos todo o comprimento do vetor
            for(int i = 0; i < this.elementos.length; i++){
                // se a posição do vetor estiver nula
                if (this.elementos[i] == null){
                    this.elementos[i] = elemento;
                    break; // para poder frear o loop do for

                    /*
             */
