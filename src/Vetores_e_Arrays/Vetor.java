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

import java.util.Arrays;

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

    //Método para obter um elemento de uma determinada posição

    /*
    Mas.. se o usuário buscar algum elemento em um campo
    que nao tem nenhum dado, necessitamos fazer um tratamento.


     */
    public String busca(int posicao){
        //se a posicao >-= 0 e posicao for menor que o tamanho, negando ela
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Você digitou uma posição invalida!");

        } else{
            return this.elementos[posicao];
        }

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
