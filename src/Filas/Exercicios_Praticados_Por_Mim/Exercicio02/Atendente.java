package Filas.Exercicios_Praticados_Por_Mim.Exercicio02;

import Filas.Aulas.Fila;
import Filas.Aulas.FilaComPrioridade;

public class Atendente {


    Fila<Pessoa> filaNormal = new Fila<>();
    Fila<Pessoa> filaPrioritaria = new FilaComPrioridade<>();
    int contadorPrioridade = 0;


    public void setSenhaNormal(Pessoa pessoa){
        filaNormal.enfileirar(pessoa); //Adiciona a fila de senhas normais
            }

    public void setSenhaPrioritaria(Pessoa pessoa){
        filaPrioritaria.enfileirar(pessoa); //adicionar a fila de senhas prioritárias
    }


    public void atenderPessoa() throws InterruptedException {
        if (!filaPrioritaria.estavazia()){ //Se a senha prioritária não estiver vazia
            //vou atendeê-la, criando uma nova instancia de pessoas que chama pessoa atendida, chamando o método de senha prioritaria
            Pessoa pessoaAtendida = filaPrioritaria.desenfileirar();
            System.out.println("Atendendo pessoa com senha: " + pessoaAtendida.getNomePessoa() + "Com prioridade!");
            Thread.sleep(2);
            System.out.println("Pessoa atendida com sucesso!");
            contadorPrioridade++;

            //1 pessoa com senha normal, deve ser atendida a cada 3 pessoas prioritárias
         if (contadorPrioridade >= 3 && !filaNormal.estavazia() && !pessoaAtendida.isPrioritaria) ;{ //se o contador de prioridade de senha chegar a 3
             Pessoa pessoaNormal = filaNormal.desenfileirar();
             System.out.println("Atendendo pessoa com senha normal: " + pessoaAtendida.getNomePessoa() + "Sem prioridade");
             Thread.sleep(2);
             System.out.println("Pessoa atendida com sucesso!");
             contadorPrioridade = 0; //vamos resetar a contagem, pois a regra terá que ser feita denovo de 3 pessoas prioritarias para 1 normal
            }

         //Não havendo prioridades, uma pessoa com senha normal, deve ser atendida
            if(!filaNormal.estavazia() && !pessoaAtendida.isPrioritaria){
                Pessoa pessoaNormal = filaNormal.desenfileirar();
                Thread.sleep(2000, 100);
                System.out.println("Atendendo: " + pessoaNormal.getNomePessoa() + "(Com atendimento normal!)");
            }
            else{
                System.out.println("Não há pessoas para atender!");
            }
        }
    }
}




