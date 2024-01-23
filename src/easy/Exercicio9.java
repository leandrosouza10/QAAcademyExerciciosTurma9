package easy;

import javax.swing.*;

/*História de Usuário: Geração da Tabuada para Número Específico
        Como usuário, desejo inserir um número inteiro entre 1 e 10, permitindo que um algoritmo calcule e exiba a tabuada desse
        número. Isso proporcionará uma maneira fácil de visualizar os resultados de multiplicação para o número selecionado.
  Critérios de Aceite:
        ○ Como usuário, posso fornecer um número inteiro entre 1 e 10 como entrada para o algoritmo.
        ○ O sistema deve verificar se o número fornecido está dentro da faixa válida (1 a 10).
        ○ O algoritmo deve calcular os resultados de multiplicação para o número selecionado, indo de 1 até 10.
        ○ O sistema deve exibir de forma clara e legível os resultados da tabuada, seguindo o formato padrão (ex.: 10 x 1 =
        10, ..., 10 x 10 = 100).*/

public class Exercicio9 {


    public static void main(String[] args) {

        System.out.println("================ TABUADA =============================");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);

        }

        System.out.println("=====================================================");

    }

}

