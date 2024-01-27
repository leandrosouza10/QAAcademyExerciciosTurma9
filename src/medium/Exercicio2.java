package medium;

import javax.swing.*;

/*A fórmula para calcular juros compostos é:

M = C * (1 + i)^t

Onde:
M = montante final
C = capital
i = taxa de juros
t = tempo */

public class Exercicio2 {

    public static void main(String[] args) {

        double valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));

        System.out.println("Valor do investimento R$ " + valorInvest);
        double juros = 0.12, valorTotal = 0, valorInvestimento;

        for (int i = 1; i <= 10; i++) {
            valorTotal = (valorTotal * juros) + valorTotal;
            System.out.println(valorTotal);
        }


    }
}
