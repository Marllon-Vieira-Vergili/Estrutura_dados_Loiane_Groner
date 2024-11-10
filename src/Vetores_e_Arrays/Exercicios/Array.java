package Vetores_e_Arrays.Exercicios;


import java.security.InvalidParameterException;

public class Array <T>  {

    //Declaração dos atributos (variáveis)
    public T[]  elementosVetor;
    public int tamanhoVetor = 0;

    //Construtor vazio (sem precisar passar parâmetro ao instanciar!)
    public Array(){

    }

    //Construtor, passando o parâmetro da capacidade do vetor
    public Array (int capacidadeVetor){
        this.elementosVetor = (T[]) new Object[capacidadeVetor];
        this.tamanhoVetor = 0;
    }


    //Método para retornar o comprimento do vetor

    public int retornarComprimentoVetor() {

        return tamanhoVetor ;
    }



    //Criação do método de adicionar elementos ao vetor

    public boolean adicionarElemento (T elemento) {

        //this.aumentarVetor();

        if (this.tamanhoVetor < this.elementosVetor.length) {
            this.elementosVetor[tamanhoVetor] = elemento;
            tamanhoVetor++;
            return true;
        } else {
            throw new ArrayIndexOutOfBoundsException("Não é possivel adicionar mais elementos ao vetor!");
        }
    }

    /*
    public boolean removerElemento(T elemento){

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
*/
    public void removerElemento(int elemento){
        int pos = this.busca((Integer) elemento);
        if (pos > -1){
           this.removerElemento(pos);
        }
    }


    public void aumentarVetor(){
        if (this.elementosVetor.length == (this.tamanhoVetor)){
            int[] novoVetor = new int[tamanhoVetor * 2 - 1];
            novoVetor[tamanhoVetor] = this.elementosVetor.length;
        }
        this.aumentarVetor();
    }


    public int acharUltimoIndice(T posicao){
        int ultimoIndice = -1;
       for ( int i = this.tamanhoVetor -1; i >= 0; i--){
           if (this.elementosVetor[i].equals(elementosVetor)){
               ultimoIndice = i;
           }

        }
       return ultimoIndice;
    }


    public int busca(int elemento) {
        for (int i = 0; i < this.elementosVetor.length; i++) {
            if (this.elementosVetor[i].equals(elemento)) {
                return i;
            }
        }
        throw new InvalidParameterException("Elemento não encontrado no array!");
    }


    public int ultimoIndice(T elemento){
        for (int i  = tamanhoVetor - 1; i >= 0; i-- ){
            if (this.elementosVetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

//Implementando o método remove em T

    public boolean remove(T elemento){
        for (int i = 0; i < tamanhoVetor; i++){
            if (this.elementosVetor[i].equals(tamanhoVetor)){
                this.elementosVetor[i] = null;
                for (int j = 0; j < tamanhoVetor; i--){
                    this.tamanhoVetor = (int) this.elementosVetor[j];
                    this.tamanhoVetor --;
                    return true;
                }
            }
        }
        return false;
    }

    //Obter posição do elemento
    public int obterPosicao (T elemento){
        for (int i = 0 ; i < this.tamanhoVetor; i++){
            if (this.elementosVetor[i].equals(tamanhoVetor)){
               return i;
            }
        }
        throw new IllegalArgumentException("Elemento não foi encontrado!");
    }


    //método para limpar todos os elementos do vetor

    public void limparTodosElementos(){
        for (int i = 0; i < tamanhoVetor; i++){
            this.elementosVetor[i] = null;
        }
        this.tamanhoVetor = 0;
    }

//implementando o método contém

    public boolean contem(T elemento){
        for (int i = 0; i < this.elementosVetor.length; i++){
            if (this.elementosVetor[i] != null && this.elementosVetor[i].equals(elemento)){
                return true;
            }
        }

        return false;
    }


 @Override

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < this.tamanhoVetor; i++){
            stringBuilder.append (this.elementosVetor[i]);
            stringBuilder.append(";");
        }

     if (this.tamanhoVetor > 0){
         stringBuilder.append(this.elementosVetor[this.tamanhoVetor-1]);
     }
     stringBuilder.append("]");

     return stringBuilder.toString();
 }



}

