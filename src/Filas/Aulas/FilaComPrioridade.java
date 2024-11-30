package Filas.Aulas;

public class FilaComPrioridade <T> extends Fila<T> {


    public void enfileirar(T elemento) {

        Comparable<T> chave = (Comparable<T>) elemento;


        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        //Se a posição é o final da fila( i == tamanho), adicione no final
        if (i == this.tamanho){
           this.adiciona(elemento); //Adiciona no final da fila
        }
        else{
            this.adiciona(i, elemento); //Adiciona na posição encontrada
        }
    }
}





    /*
    Interface comparable, como o java faz?


    se o obj1 > obj2 o java retorna > 0 ou seja, ele retorna (1)
    se o obj1 < obj2, o java retorna valoe < 0, ou seja, ele retorna (-1)

    se for igual, ele retorna 0;
     */

