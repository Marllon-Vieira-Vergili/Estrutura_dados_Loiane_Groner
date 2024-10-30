package Vetores_e_Arrays.teste_Vetor;


import Vetores_e_Arrays.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) throws Exception {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-4545", "contato2mail.com");
        Contato c3 = new Contato("Contato 3", "4335-5d34", "contato3@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

    //Podemos utilizar também métodos de busca
        boolean pos = vetor.busca(c3);
        if (pos == true){
            System.out.println("Elemento existe no vetor!");
        }
        else{
            System.out.println("Elemento não existe no vetor!");
        }
    }
}
