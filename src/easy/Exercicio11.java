package easy;

import javax.swing.*;

/* Descrição: Como um usuário, gostaria de um algoritmo que leia um número inteiro e realize a soma de 2 ao número
digitado. Essa operação deve ser repetida até atingir 100 iterações.

Critérios de Aceite:
    ○ O programa deve solicitar ao usuário que insira um número inteiro.
    ○ O algoritmo deve realizar a soma de 2 ao número digitado.
    ○ A operação de soma deve ser repetida até que 100 iterações sejam atingidas.
    ○ Após cada iteração, o programa deve exibir o resultado da soma.
    ○ O programa deve lidar corretamente com números negativos, mantendo a lógica de adicionar 2 a cada
    iteração.
    ○ O programa deve exibir mensagens claras indicando o número da iteração atual e o resultado da soma.
    ○ Ao atingir a 100a iteração, o programa deve exibir uma mensagem indicando o término do processo.*/


public class Exercicio11 {


    public static void main(String[] args) {

        int numero = Integer.parseInt((JOptionPane.showInputDialog("Digite um número: ")));

        for (int i = 1; i <= 100; i++) {
            numero += 2;
            System.out.println(numero + " + 2");

        }
        System.out.println("Fim das Iterações!!");
    }
}

