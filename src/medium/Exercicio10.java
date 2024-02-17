package medium;

/*
Descrição: Como um usuário, desejo um algoritmo que calcule e exiba a sequência de Fibonacci até o 10o elemento, utilizando um
    vetor para armazenar o resultado.

Critérios de Aceite:
    ○ O programa deve calcular a sequência de Fibonacci até o 10o elemento.
    ○ A sequência de Fibonacci começa com 0 e 1 como os dois primeiros elementos.
    ○ O resultado da sequência deve ser armazenado em um vetor.
    ○ O vetor resultante deve ser exibido de maneira clara e organizada.
    ○ O algoritmo deve seguir a lógica da sequência de Fibonacci, onde cada termo é a soma dos dois anteriores.
    ○ A exibição da sequência de Fibonacci no vetor deve apresentar cada elemento em ordem.
    * */

import javax.swing.*;

public class Exercicio10 {

    public static void main(String[] args) {

        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de Fibonacci que você deseja descobrir"));

        int[] fibonacci = new int[elemento];

        // Definindo os dois primeiros elementos da sequência de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculando os elementos subsequentes da sequência de Fibonacci e armazenando no vetor
        for (int i = 2; i <fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // Exibindo a sequência de Fibonacci
        for (int i : fibonacci) {
            System.out.print(i + " ");
        }
    }
}
