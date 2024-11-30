package Pilhas.Definicoes;

public class Aula14 {
    public static void main(String[] args) throws Exception {

        Pilha<Integer> pilha = new Pilha<>(30);

        for (int i = 1; i <= 10; i++){
            pilha.empilha(i);

        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
