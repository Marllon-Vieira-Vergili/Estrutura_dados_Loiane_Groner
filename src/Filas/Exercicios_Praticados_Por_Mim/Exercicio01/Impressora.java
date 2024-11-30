package Filas.Exercicios_Praticados_Por_Mim.Exercicio01;

import Filas.Aulas.Fila;
import Filas.Aulas.FilaComPrioridade;

public class Impressora <T> {

    Fila<Documentos> fila = new FilaComPrioridade<>();


    public void enfileirando(Documentos documentos){

            fila.enfileirar(documentos);
            System.out.println("Documento enfileirado.");

    }


    public void imprimir() throws InterruptedException {
        if (!fila.estavazia()) {
            Documentos documentos = fila.desenfileirar();

            System.out.println("Imprimindo elementos: " + documentos.getNome());
            Thread.sleep(documentos.getQuantidade_folhas() * 1000); //por exemplo, 1 seg para cada folha
            System.out.println("Documentos Impressos!!" + documentos.getNome());

        }else{
            System.out.println("Não há documentos na fila para imprimir!");
        }
    }

    @Override
    public String toString() {
        return "Impressora{" +
                "fila=" + fila +
                '}';
    }
}

