package Filas.Aulas;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula24 {
    public static void main(String[] args) {


        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
        FilaComPrioridade<Paciente> paciente = new FilaComPrioridade<>();
        Queue<Integer> fila1 = new PriorityQueue<>();


        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(4);


       paciente.enfileirar(new Paciente("A", 1));
       paciente.enfileirar(new Paciente("B", 3));
        paciente.enfileirar(new Paciente("C", 2));

        System.out.println(fila); //1 2 3 e não 1 2 3
        System.out.println(paciente);
    }
}
