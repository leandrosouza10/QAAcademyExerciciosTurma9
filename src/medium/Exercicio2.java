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
        double juros = 0.12, valorTotal = 0.0;
        double limite = 10;

        double valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        valorTotal = valorInvest;

        for (int i = 1; i <= limite; i++) {
            valorTotal = (valorTotal * juros) + valorTotal;
            System.out.printf("Valor Total R$ %.2f\n", valorTotal);
        }

        System.out.printf("Valor do investimento R$ %.2f\n", valorInvest);
        System.out.printf("Valor do investimento R$ %.2f\n", (valorTotal - valorInvest));
        System.out.printf("Valor do investimento R$ %.2f", valorTotal);

    }
}
