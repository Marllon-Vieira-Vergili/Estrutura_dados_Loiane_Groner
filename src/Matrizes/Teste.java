package Matrizes;

public class Teste {
    public static void main(String[] args) {

        Matrix<Integer> matrix = new Matrix<>();

        //testandoTamanho();
        testandolimpandoMatriz();
        //preencherTodaMatrizTeste();

    }

    public static void preencherTodaMatrizTeste(){
        Matrix <Integer> matriz = new Matrix<>();

        matriz.adicionarELemento(0, 0, 1);
        matriz.adicionarELemento(0, 1, 2);
        matriz.adicionarELemento(0, 2, 3);
        matriz.adicionarELemento(1, 0, 4);
        matriz.adicionarELemento(1, 1, 5);
        matriz.adicionarELemento(2, 2, 9);


        matriz.preencherMatrizToda(3);
        System.out.println(matriz);
    }

         public static void  testandoTamanho(){
            Matrix <Integer> matriz = new Matrix<>();

            matriz.adicionarELemento(0, 0, 1);
            matriz.adicionarELemento(0, 1, 2);
            matriz.adicionarELemento(0, 2, 3);
            matriz.adicionarELemento(1, 0, 4);
            matriz.adicionarELemento(1, 1, 5);
            matriz.adicionarELemento(2, 2, 9);

            System.out.println(matriz);

            System.out.println(matriz.retornarTamanho());
            System.out.println(matriz.obterElemento(0,1));



        }

        public static void testandolimpandoMatriz(){
            Matrix <Integer> matriz = new Matrix<>();

            matriz.adicionarELemento(0, 0, 1);
            matriz.adicionarELemento(0, 1, 2);
            matriz.adicionarELemento(0, 2, 3);
            matriz.adicionarELemento(1, 0, 4);
            matriz.adicionarELemento(1, 1, 5);
            matriz.adicionarELemento(2, 2, 9);

            System.out.println(matriz.limparMatriz());
            System.out.println("matriz limpa!");
            System.out.println(matriz);
        }

        public void matrizVazia(){
            Matrix <Integer> matriz = new Matrix<>();

            matriz.adicionarELemento(0, 0, 0);
            matriz.adicionarELemento(0, 0, 0);
            matriz.adicionarELemento(0, 0, 0);
            matriz.adicionarELemento(0, 0, 0);
            matriz.adicionarELemento(0, 0, 0);
            matriz.adicionarELemento(0, 0, 0);

            System.out.println(matriz.estaVazia());
        }
    }


