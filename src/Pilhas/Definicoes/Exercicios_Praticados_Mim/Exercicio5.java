/*
Escreva um programa que testa se uma sequência de caracteres fornecida
pelo usuário é um palíndromo, ou seja, uma palavra cuja primeira metade
é simétrica a segunda metade. veja exemplos:

- AABCCBAA - sim
- AADDFDDA - sim
- ABFFBB - não


 */


package Pilhas.Definicoes.Exercicios_Praticados_Mim;

import Pilhas.Definicoes.Pilha;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha<Character > pilha = new Pilha<>();

        System.out.println("Digite o caracter desejado: ");
        String caracteres = sc.next();

        //metodo para colocar todos os caracteres em minusculo, com to lower caso, com //s que significa
        //tirar os espaços, e colocar linhas vazias como parâmetro
        caracteres = caracteres.replaceAll("\\s+", "").toLowerCase();
        System.out.println(caracteres);

        //A variável n, vai pegar o comprimento desses caracteres
        int n = caracteres.length();

        //A variável meio, vai dividir eles por 2
        int meio = n /2;


        //Empilhando a primeira metade
        for (int i = 0; i < meio; i++){
            pilha.empilha(caracteres.charAt(i));
        }

        //se o número de caracteres for ímpar, pula o caracter do meio
        //como se fosse um método mais compacto
        int caracteresImpar = (n % 2 == 0) ? meio : meio + 1;

        //ou
        /*
        if (n % 2 == 0){
            meio += 1;
        }
*/

        //Vou comparar a segunda metade com os caracteres da pilha

        boolean palindromo = true;
        //Percorrendo o string até o meio dele
        for (int i = caracteresImpar; i < n; i++) {
            //To verificando se a pilha estiver vazia, ou se estiver desempilhada e se for diferente dos caracteres na
            //posição i, então, ele não é um palíndromo
            if (pilha.estavazia() || pilha.desempilhar() != caracteres.charAt(i)) {
                palindromo = false;
                break;
            }
        }

        //Exibir os retorno dos resultados

        if (palindromo == true){
            System.out.println("È um palíndromo!");
        }
        else{
            if (!palindromo){
                System.out.println("Não é um palíndromo!");
            }
        }
        sc.close();
            }

        }
