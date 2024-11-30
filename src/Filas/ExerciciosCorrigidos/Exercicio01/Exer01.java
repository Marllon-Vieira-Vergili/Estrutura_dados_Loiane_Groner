package Filas.ExerciciosCorrigidos.Exercicio01;

import Filas.Aulas.Fila;

public class Exer01 {
    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileirar(new Documento("A", 1));
        filaImpressora.enfileirar(new Documento("B", 2));
        filaImpressora.enfileirar(new Documento("C", 3));
        filaImpressora.enfileirar(new Documento("D", 5));
        filaImpressora.enfileirar(new Documento("E", 6));

        while (!filaImpressora.estavazia()){
            Documento doc = filaImpressora.desenfileirar();
            System.out.println("Imprimindo documento: " + doc.getNome());

            try{
                Thread.sleep(200 * doc.getNumFolhas());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos!");
    }
}
