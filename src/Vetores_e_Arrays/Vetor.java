package Vetores_e_Arrays;

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

public class Vetor {

    private String[] elementos;
    private int tamanho = 0;

    //Criando o construtor com a capacidade que eu quero criar

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
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
