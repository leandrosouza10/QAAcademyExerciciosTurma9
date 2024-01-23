package easy;

import javax.swing.*;

/* História de Usuário: Troca de Valores
        Como usuário, desejo ter a capacidade de fornecer dois valores, permitindo que um algoritmo os leia, armazene em variáveis
        e os exiba trocados, a fim de facilitar a compreensão do funcionamento da troca de variáveis.
   Critérios de Aceite:
        ○ Como usuário, devo fornecer dois valores distintos como entrada para o algoritmo.
        ○ O algoritmo deve ser capaz de ler os dois valores fornecidos pelo usuário e armazená-los em variáveis
        distintas.
        ○ O sistema deve exibir os valores trocados de forma clara e legível. */

public class Exercicio3 {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Informe um valor podendo ser número ou letra:");
        String valor2 = JOptionPane.showInputDialog("Informe outro valor podendo ser número ou letra:");

        System.out.println("Os valores informados foram: " + valor1 + " " + valor2 +
                "\nAgora trocados: " + valor2 + " " + valor1);


    }
}
