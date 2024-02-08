package medium;

/* Descrição: Como um usuário, desejo um algoritmo que leia cinco números, verifique e exiba qual deles é o menor.

   Critérios de Aceite:
        ○ O programa deve solicitar ao usuário que insira cinco números inteiros.
        ○ O algoritmo deve identificar e exibir qual dos cinco números é o menor.
        ○ A exibição do resultado deve ser clara e incluir uma mensagem indicando qual número é o menor.
        ○ Caso dois ou mais números sejam iguais e os menores, qualquer um deles pode ser considerado como o menor na exibição. */

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {

        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            int numeroInformado = Integer.parseInt(JOptionPane.showInputDialog("Digite cinco números:"));
            System.out.println("Números informados " + numeroInformado);

            if (numeroInformado < menorNumero) {
                menorNumero = numeroInformado;
            }
        }
        System.out.println("O menor número é: " + menorNumero);

    }
}
