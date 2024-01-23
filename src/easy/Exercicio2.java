package easy;

import javax.swing.*;

/* História de Usuário: Leitura e Exibição de Palavra
        Como usuário, desejo ter a capacidade de inserir uma palavra e visualizá-la, permitindo uma interação simples
        com um algoritmo de leitura e exibição.
Critérios de Aceite:
        ○ Como usuário, devo fornecer uma palavra como entrada para o algoritmo.
        ○ O algoritmo deve ser capaz de ler e armazenar a palavra fornecida pelo usuário.
        ○ O sistema deve exibir a palavra lida de forma clara e legível.
        ○ O algoritmo deve permitir que o usuário insira múltiplas palavras para leitura */

public class Exercicio2 {

    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        System.out.println("A palavra digitada foi " + palavra);

    }

}
