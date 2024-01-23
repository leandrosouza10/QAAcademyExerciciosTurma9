package easy;

import javax.swing.*;

/* História de Usuário: Cálculo do Dobro de um Número
        Como usuário, desejo ter a capacidade de inserir um número inteiro, permitindo que um algoritmo o leia, armazene em uma
        variável, calcule o dobro desse número e exiba o resultado, a fim de realizar de maneira eficiente o cálculo do dobro de um
        número.
   Critérios de Aceite:
        ○ Como usuário, devo inserir um número inteiro como entrada
        ○ O algoritmo deve ser capaz de ler o número inteiro fornecido pelo usuário e armazená-lo em uma variável.
        ○ Após a leitura, o algoritmo deve calcular o dobro do número armazenado na variável.
        ○ O sistema deve exibir de forma clara e legível o resultado do cálculo, representando o dobro do número fornecido
        pelo usuário. */

public class Exercicio4 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int resultado = numero * 2;

        System.out.println("O dobro do valor digitado é: " + resultado);
    }
}
