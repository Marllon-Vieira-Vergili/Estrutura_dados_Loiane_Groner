package Filas.ExerciciosCorrigidos.Exercicio03;

import Filas.Aulas.FilaComPrioridade;


public class Exercicio03 {




    public static void main(String[] args) {



        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Pessoa("1", Prioridade.VERDE.getValor()));
        fila.enfileirar(new Pessoa("2", Prioridade.AMARELO.getValor()));
        fila.enfileirar(new Pessoa("3", Prioridade.VERMELHO.getValor()));
        fila.enfileirar(new Pessoa("4", Prioridade.VERDE.getValor()));
        fila.enfileirar(new Pessoa("5", Prioridade.VERDE.getValor()));
        fila.enfileirar(new Pessoa("6", Prioridade.VERMELHO.getValor()));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);
        t1.start();
        t2.start();
    }
}
