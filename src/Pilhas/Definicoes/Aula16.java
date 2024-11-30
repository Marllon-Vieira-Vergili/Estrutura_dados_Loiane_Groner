package Pilhas.Definicoes;

public class Aula16 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topoPIlha());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.topoPIlha());
        System.out.println(pilha);

    }
}
