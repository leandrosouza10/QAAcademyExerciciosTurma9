package medium;

/*
Descrição: Como um usuário, desejo um algoritmo que exiba todos os meses que foram digitados e armazenados anteriormente em um vetor.

Critérios de Aceite:
    ○ O programa deve ter uma funcionalidade dedicada à exibição dos meses armazenados.
    ○ A exibição dos meses deve ser apresentada de maneira clara e organizada.
    ○ O código deve garantir que a exibição ocorra somente após o usuário ter inserido os meses.
    ○ Se nenhum mês foi inserido, o programa deve exibir uma mensagem indicando que não há meses para serem mostrados.
    ○ A mensagem de exibição deve incluir uma indicação clara de que se trata dos meses armazenados
 */

import javax.swing.*;

public class Exercicio8 {

    public static void main(String[] args) {

        String[] mesesAno = new String[12];

        for (int i = 0; i < 12; i++) {
            mesesAno[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º mês: ");
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(mesesAno[i]);
        }

    }

}
