/*
/*
Utilize a classe Fila para simular um sistema de senhas de um pronto socorro.
Cada pessoa pode ser classificada com 3 códigos: Vermelho(maior prioridade),
Amarelo (prioridade média)
e verde (quando a situação não é grave e pode esperar mais tempo). O programa deve obedecer as seguintes condições:

1  - Enfileire 6 pessoas na fila inicial
2 -  Pessoas com prioridade vermelha devem ser atendidas primeiro;
3 - Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
4 - A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
(cria um código java para criar aleatoriedade)

 */


package Filas.Exercicios_Praticados_Por_Mim.Exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {


        final int FILA_INICIAL = 6;

        ProntoSocorro prontoSocorro = new ProntoSocorro();

        for (int i = 0; i < FILA_INICIAL; i++){

            String prioridade = prontoSocorro.gerarPrioridadeAleatoria();
            Pessoa paciente = new Pessoa("Paciente" + (i + 1),prioridade);

            if (prioridade.equals("Vermelho")){
                prontoSocorro.prioridadeVermelha.enfileirar(paciente);

            } else if (prioridade.equals("Amarelo")) {
                prontoSocorro.prioridadeAmarela.enfileirar(paciente);
            }
            else if (prioridade.equals("Verde")){
                prontoSocorro.prioridadeVerde.enfileirar(paciente);
            }

System.out.println("Enfileirando paciente: " + paciente.getNome() +  "com prioridade: " + paciente.getPrioridade());
        }




    }
}
