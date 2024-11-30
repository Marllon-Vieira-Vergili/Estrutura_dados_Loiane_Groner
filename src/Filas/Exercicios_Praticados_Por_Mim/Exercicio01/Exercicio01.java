/*
Usando a estrutura de dados fila, crie uma fila de documentos que precisam
ser impressos.
Cada documento é composto de um nome e quantidade de folhas a serem impressas. O programa deve:

Enfileirar os documentos.

E seguindo a ordem, o programa deve "Imprimir" cada documento, desenfileirando da fila.
Se desejar, pode usar Threads para esperar a impressão de acordo com o número de folhas a serem impressas.

 */

package Filas.Exercicios_Praticados_Por_Mim.Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) throws InterruptedException {


      Impressora impressora = new Impressora();


      Documentos impressora1 = new Documentos("João", 2);
      Documentos impressora2 = new Documentos("Caio", 5);

      impressora.enfileirando(impressora1);
      impressora.enfileirando(impressora2);

      try{
          impressora.imprimir();
          impressora.imprimir();
      }catch (InterruptedException e){
          System.out.println("Erro ao tentar imprimir documento: " + e.getMessage());
      }


    }
}
