package Filas.Usando_API_Queue;

import Filas.Aulas.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Integer> filacomPrioridade = new PriorityQueue<>();

        //eu instanciei uma fila da classe paciente, e ja implementei um comparator dentro desse método, sem
        //precisar pegar da classe! apertando o ctrl + espaço
        Queue<Paciente> pacientes = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                        //OU podemos usar classe primitiva wrapper, como no exemplo abaixo!
                        //return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                        //ou com esse if abaixo também da certo
                        if (p1.getPrioridade() > p2.getPrioridade()){
                            return 1;
                        }else if (p1.getPrioridade() < p2.getPrioridade()){
                            return -1;
                        }
                        return 0;
                    }
                }

        );

        filacomPrioridade.add(2);
        filacomPrioridade.add (1);
        filacomPrioridade.add(3);

        pacientes.add(new Paciente("A", 20));
        pacientes.add(new Paciente("B", 30));


        System.out.println(filacomPrioridade);
        System.out.print(pacientes);
    }


}
