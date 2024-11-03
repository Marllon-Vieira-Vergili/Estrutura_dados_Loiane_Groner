package Exercicios;

import java.util.Arrays;

public class Array {

    //Declaração dos atributos (variáveis)
    public String [] elementosVetor;
    public int tamanhoVetor = 0;

    //Construtor vazio (sem precisar passar parâmetro ao instanciar!)
    public Array(){

    }

    //Construtor, passando o parâmetro da capacidade do vetor
    public Array (int capacidadeVetor){
            this.elementosVetor = new String[capacidadeVetor];
            this.tamanhoVetor = 0;
        }


        //Método para retornar o comprimento do vetor

    public int retornarComprimentoVetor() {

          return tamanhoVetor ;
            }



        //Criação do método de adicionar elementos ao vetor

        public boolean adicionarElemento (String elemento) {



            if (this.tamanhoVetor < this.elementosVetor.length) {
                this.elementosVetor[tamanhoVetor] = elemento;
                tamanhoVetor++;
                return true;
            } else {
                throw new ArrayIndexOutOfBoundsException("Não é possivel adicionar mais elementos ao vetor!");
            }
        }

       public boolean removerElemento(String elemento){

        for (int i=0 ; i < tamanhoVetor; i++){
                if (this.elementosVetor[i].equals(elemento)){
                    for (int j = 0; j < tamanhoVetor; j--){
                        elementosVetor[j] = elementosVetor[j + 1];
                    }
                    elementosVetor[tamanhoVetor - 1] = null;
                    tamanhoVetor--;
                    return true;
                }
            }
        return false;
        }

        public void aumentarVetor(){
            if (this.elementosVetor.length == (this.tamanhoVetor)){
                int[] novoVetor = new int[tamanhoVetor * 2 - 1];
                novoVetor[tamanhoVetor] = this.elementosVetor.length;
            }
            this.aumentarVetor();
        }







    @Override
    public String toString() {


        return "Array{" +
                "elementosVetor=" + Arrays.toString(elementosVetor) +
                '}';

    }
}



