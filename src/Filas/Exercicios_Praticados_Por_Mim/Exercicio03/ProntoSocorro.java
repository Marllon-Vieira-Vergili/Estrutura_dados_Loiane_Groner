package Filas.Exercicios_Praticados_Por_Mim.Exercicio03;

import Filas.Aulas.Fila;
import Filas.Aulas.FilaComPrioridade;

import java.util.Random;

public class ProntoSocorro {



    Fila<Pessoa> prioridadeVermelha = new FilaComPrioridade<>();
    Fila<Pessoa> prioridadeAmarela = new Fila<>();
    Fila<Pessoa> prioridadeVerde = new Fila<>();


    public void atenderPessoa() throws InterruptedException {

        while (!prioridadeVermelha.estavazia() || !prioridadeAmarela.estavazia()|| !prioridadeVerde.estavazia()){

            //enquanto pessoa vermelha não estiver vazia, nem a amarela, nem a verde, ele não vai parar
            if (!prioridadeVermelha.estavazia()) {
                Pessoa pessoaVermelha = prioridadeVermelha.desenfileirar();
                System.out.println("Atendento pessoa: " + pessoaVermelha.getNome() + " Com prioridade: " + pessoaVermelha.getPrioridade());
                Thread.sleep(5000);
                System.out.println("Pessoa atendida com sucesso!");

            }


             else if (!prioridadeAmarela.estavazia()){
                    Pessoa pessoaAmarela = prioridadeAmarela.desenfileirar();
                   System.out.println("Atendento pessoa: " + pessoaAmarela.getNome() + " Com prioridade: " + pessoaAmarela.getPrioridade());
                   Thread.sleep(5000);
                   System.out.println("Pessoa atendida com sucesso!");

               }

             else if (!prioridadeVerde.estavazia()) {
                   Pessoa pessoaVerde = prioridadeVerde.desenfileirar();
                   System.out.println("Atendento pessoa: " + pessoaVerde.getNome() + " Com prioridade: " + pessoaVerde.getPrioridade());
                   Thread.sleep(5000);
                   System.out.println("Pessoa atendida com sucesso!");
               }

        }

    }

    public void pacienteAleatorio() throws InterruptedException {


       Pessoa novoPaciente = new Pessoa("Paciente" + System.nanoTime(), gerarPrioridadeAleatoria());

       if (gerarPrioridadeAleatoria().equals("Vermelho")){
           prioridadeVermelha.enfileirar(novoPaciente);
           System.out.println("Chegou um novo paciente com prioridade vermelha!");

       } else if (gerarPrioridadeAleatoria().equals("Amarelo")) {
           prioridadeAmarela.enfileirar(novoPaciente);
           System.out.println("Chegou um novo paciente com prioridade amarela!");
       }
       else if (gerarPrioridadeAleatoria().equals("Verde")){
           prioridadeVerde.enfileirar(novoPaciente);
           System.out.println("Chegou um novo paciente com prioridade Verde!");
       }
       /*


        if (System.nanoTime() % 4000 < 1000){




            Random random = new Random();
            int contagem_random = 3;

            if (contagem_random == 1){
                prioridadeAleatoria = prioridadeVermelha.desenfileirar();
                if (prioridadeAleatoria.getPrioridade() == "Vermelho" ||prioridadeAleatoria.getPrioridade() == "Vermelho".toLowerCase()){
                    System.out.println("Chegou um paciente com prioridade vermelha!");


                }

            } else if (contagem_random == 2) {
                prioridadeAleatoria = prioridadeAmarela.desenfileirar();
                System.out.println("Chegou um paciente com prioridade Amarela!");
                if (prioridadeAleatoria.getPrioridade() == "Amarelo" ||prioridadeAleatoria.getPrioridade() != "Vermelho".toLowerCase()){
                    System.out.println("Chegou um paciente com prioridade Amarelo!");


                }
            }else{
                prioridadeAleatoria = prioridadeVerde.desenfileirar();
                System.out.println("Chegou um paciente com prioridade verde!");
            }
        }

             */
    }


public String gerarPrioridadeAleatoria(){
        if (System.currentTimeMillis() % 4000 < 1000){

            Random random = new Random();

            int prioridade = random.nextInt(3);

            switch (prioridade){

                case 0:
                    return "Vermelho";

                case 1:
                    return "Amarelo";

                case 2:
                    return "Verde";
            }

        }
        return "";
    }
}





