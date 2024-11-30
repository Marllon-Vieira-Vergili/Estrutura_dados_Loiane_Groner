package Vetores_e_Arrays.Exercicios.Executando_Exercicios.Os_Que_Tentei_Fazer;

import Vetores_e_Arrays.Exercicios.Array;
import Vetores_e_Arrays.Exercicios.Contato;

public class Testando {
    public static void main(String[] args) {


        Array<Contato> array = new Array<Contato>(20);
        array.adicionarElemento(new Contato<>("Marllon","35998872457", "marllon@cooxupe.com.br"));

        for (int i = 0; i < 30; i++){
            array.adicionarElemento(new Contato<>("joão", "5878965", "joao@cooxupe.com.br"));
        }

array.limparTodosElementos();
System.out.println(array);
    }
}
