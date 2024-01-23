package easy;

import javax.swing.*;

/*História de Usuário: Operações com Três Números Inteiros
        Como usuário, desejo ter a capacidade de inserir três números inteiros, permitindo que realize operações de soma, subtração, multiplicação e calcule a
        média dos números digitados. Isso proporcionará uma maneira conveniente de obter resultados essenciais dessas operações.
  Critérios de Aceite:
        ○ Como usuário, posso fornecer três números inteiros como entrada para o algoritmo.
        ○ O algoritmo deve ser capaz de ler os três números inteiros fornecidos pelo usuário e armazená-los em variáveis distintas.
        ○ O sistema deve realizar as seguintes operações:
        ■ Soma dos três números.
        ■ Subtração do segundo número pelo primeiro.
        ■ Multiplicação dos três números.
        ■ Cálculo da média dos três números.
        ○ O algoritmo deve exibir de forma clara e legível os resultados das operações realizadas, incluindo soma, subtração, multiplicação e
        média */

public class Exercicio5 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(("Digite o segundo número:")));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog(("Digite o terceiro número")));

        int soma = numero1 + numero2 + numero3;
        int subtracao = numero2 - numero1;
        int multiplicacao = numero1 * numero2 * numero3;
        int media = (soma)/3;

        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da subtração é: " + subtracao);
        System.out.println("O valor da multiplicação é: " + multiplicacao);
        System.out.println("O valor da média é: " + media);


    }
}
