package medium;

/* Historia de usuário: Como um usuário, desejo um algoritmo que verifique e exiba os números de 0 a 100, identificando
        quais são pares e ímpares.
   Critérios de Aceite:
        ○ O programa deve percorrer os números inteiros de 0 a 100.
        ○ Para cada número, o algoritmo deve identificar se é par ou ímpar.
        ○ A exibição dos resultados deve ser organizada e fácil de entender.
        ○ Caso um número seja zero, o programa deve tratá-lo corretamente e indicar se é par ou ímpar.*/


public class Exercicio1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("O Número " + i + " é par");
            } else {
                System.out.println("O Número " + i + " é impar");
            }
        }
    }
}

