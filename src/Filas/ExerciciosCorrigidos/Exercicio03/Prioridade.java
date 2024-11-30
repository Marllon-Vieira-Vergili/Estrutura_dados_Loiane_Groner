package Filas.ExerciciosCorrigidos.Exercicio03;

public enum Prioridade {
    VERDE(2),
    AMARELO(1),
   VERMELHO(0) ;


   public  final int valor;

    Prioridade(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
