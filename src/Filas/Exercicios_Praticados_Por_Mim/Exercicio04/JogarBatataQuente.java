package Filas.Exercicios_Praticados_Por_Mim.Exercicio04;

import Filas.Aulas.Fila;

public class JogarBatataQuente {


    Fila<Crianca> criancasFila = new Fila<>();


    private static final int NUMERO_PASSAGENS = 5; //Ou podemos usar um enumerator para fazer um método de constante


    public void comecarJogo() throws InterruptedException {
        // Enfileirando as crianças
        criancasFila.enfileirar(new Crianca("João"));
        criancasFila.enfileirar(new Crianca("Maria"));
        criancasFila.enfileirar(new Crianca("Pedro"));
        criancasFila.enfileirar(new Crianca("Ana"));
        criancasFila.enfileirar(new Crianca("Carlos"));
        criancasFila.enfileirar(new Crianca("Beatriz"));

        int contadorPasses = 0;

        //Enquanto houver mais de uma criança na fila

        System.out.println("Batata quente... ");
        while (criancasFila.tamanho() > 1) { //A fila deve ter mais de uma criança
            System.out.println(" Quente...");

            //Vamos passar a batata para a próxima criança
            Crianca criancaComBatata = criancasFila.desenfileirar(); //Desenfileirando a criança &
            criancasFila.enfileirar(criancaComBatata); //Enfilera novamente ao final da fila
            //contabilizando os passos
            contadorPasses++;
            Thread.sleep(200); //simulando 1 segundo de passar a batata para outra mão

            //vamos verificar se a batata "queimou"

            if (contadorPasses == NUMERO_PASSAGENS) {
                criancasFila.desenfileirar();
                System.out.println("Queimou! " + criancaComBatata.getNome() + " foi eliminado(A)!");
                //A criança foi eliminada, não precisa enfileirar ela de volta!
                contadorPasses = 0;//resetando o contador de passes

                System.out.println("Total de crianças restantes: " + criancasFila.tamanho());

                //Quando sobrar apenas uma criança, a vencedora!
                if (criancasFila.tamanho() == 1) {
                    Crianca vencedora = criancasFila.desenfileirar(); //criança que sobrou
                    System.out.println("A criança que venceu é: " + vencedora.getNome());
                    //break; //encerra o jogo
                }



            }

        }
    }
}










    //Esse código, foi o que eu tentei implementar de começo, por conta própria!
/*
    public void comecarJogo(Crianca criancas) throws InterruptedException {
        try{

        if (!criancasFila.estavazia()) {
            criancasFila.enfileirar(criancas);

            for (int i = 0; i <10;i++){
                while(criancaForaRoda){
                    System.out.println("Batata quente..");
                    Thread.sleep(1000);
                    System.out.println("quente");
                    if (!criancaForaRoda){
                        System.out.println("Quenteee!!!....");
                        Thread.sleep(1000);
                        System.out.println("Queimou!");
                        criancasFila.desenfileirar();
                        System.out.println("Criança: " + criancas.getNome() + "Eliminada!");
                        i++;
                    }
                }
            }
        }
    } catch (Exception e){
            throw new RuntimeException("Erro ao executar o programa!");
        }
    }
}

*/