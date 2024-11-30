package Filas.ExerciciosCorrigidos.Exercicio02;

import Filas.Aulas.Fila;

public class Exercicio02 {
    public static void main(String[] args) {

        Fila<String> regular = new Fila<>();
        Fila <String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3; //uma constante que vai até 3

        regular.enfileirar("Pessoa 1");
        regular.enfileirar("Pessoa 2");
        regular.enfileirar("Pessoa 3");
        prioridade.enfileirar("Pessoa 1 ");
        prioridade.enfileirar("Pessoa 2 ");
        prioridade.enfileirar("Pessoa 3 ");
        prioridade.enfileirar("Pessoa 4 ");
        regular.enfileirar("Pessoa 4");
        regular.enfileirar("Pessoa 5");
        regular.enfileirar("Pessoa 6");
        regular.enfileirar("Pessoa 7");


        //tendo pessoas na fila em outra, a gente vai atender essas pessoas
        while (!regular.estavazia() || !prioridade.estavazia()){

            int cont = 0;

            //aqui vamos atender pessoas com prioridade
            while (!prioridade.estavazia() && cont < MAX_PRIORIDADE){
                atendePessoa(prioridade);
                cont++;
            }

            //se 3 pessoas com prioridade for atendida, a gente vai pegar uma pessoa regular
            if (!regular.estavazia()){
                atendePessoa(regular);
            }


            //verificar novamente se a prioridade está vazia, depois de atender uma da regular
            //se nao tiver vazia, vai retornar ao inicio e contar tudo novamente
            if (!prioridade.estavazia()){
                while (!regular.estavazia()){
                    atendePessoa(regular);
                }
            }
        }

    }

    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida + " com prioridade foi atendida!");
    }
}
