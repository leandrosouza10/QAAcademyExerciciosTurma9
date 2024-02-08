package medium;
/*Descrição: Como um usuário, desejo um algoritmo que leia um número inteiro, calcule e exiba o fatorial desse número.

  Critérios de Aceite:
        ○ O programa deve solicitar ao usuário que insira um número inteiro.
        ○ O algoritmo deve calcular o fatorial do número digitado.
        ○ A exibição do resultado deve ser clara e incluir uma mensagem indicando que é o fatorial do número digitado.
        ○ Caso o número digitado seja zero, o resultado do fatorial deve ser 1. */

import javax.swing.*;

public class Exercicio6 {

    public static void main(String[] args) {

        int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.println("Número digitado: " + fatorial);
        for (int i = fatorial; i > 1; i--)
            fatorial *= (i - 1);
        if (fatorial == 0) {
            System.out.println("1");
        }
        System.out.println(fatorial);
    }


}

