package Pilhas.Definicoes;




import java.lang.reflect.Array;

//Agora a classe Lista é um tipo Genérico, ou seja, podemos escolher o tipo de dados que quisermos para instanciarmos!
public class EstruturaEstatica <T> {

    protected T[] elementos;
    protected int tamanho = 0;

    //Criando o construtor com a capacidade que eu quero criar


    public EstruturaEstatica(){
        this(10);
    }

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Ou pode usar o construtor dessa forma, mas a primeira é mais facil entender

    public EstruturaEstatica(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    protected boolean adiciona(T elemento)  {


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

    protected boolean adiciona(int posicao, T elemento){

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


    //Método para veriicar se a pilha está vazia

    public boolean estavazia(){
        return this.tamanho ==0;
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


















