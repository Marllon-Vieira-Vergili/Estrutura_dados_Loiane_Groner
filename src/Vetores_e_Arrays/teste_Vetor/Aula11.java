package Vetores_e_Arrays.teste_Vetor;

import Vetores_e_Arrays.Classes.Contato;
import Vetores_e_Arrays.Classes.Lista;

public class Aula11 {
    public static void main(String[] args) throws Exception {


        Lista <Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-4545", "contato2mail.com");
        Contato c3 = new Contato("Contato 3", "4335-5d34", "contato3@email.com");

        vetor.adiciona(c2);
    }
}
