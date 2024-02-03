package easy;

import javax.swing.*;

/*História de Usuário: Cálculo de Investimento com Juros Simples
        Como usuário, desejo inserir um valor de investimento e visualizar, após 10 anos, o valor investido, o montante dos juros e
        o total acumulado com juros, considerando uma taxa de juros simples de 12% ao ano. Isso proporcionará uma
        compreensão clara do rendimento do investimento ao longo do tempo.
 Critérios de Aceite:
        ○ Como usuário, posso fornecer o valor do investimento como entrada para o algoritmo.
        ○ O sistema deve calcular o montante dos juros simples ao longo de 10 anos, utilizando uma taxa de juros de
        12% ao ano.
        ○ O sistema deve calcular o total acumulado, somando o valor inicial do investimento e o montante dos juros
        simples.
        ○ O sistema deve exibir de forma clara e legível o valor investido, o montante dos juros e o total acumulado
        com juros após 10 anos. */

public class Exercicio10 {

    public static void main(String[] args) {

        System.out.println("================== Cálculo de Investimento com Juros Simples =========================\n");

        System.out.println("Fórmula para calcular juros simples: J = C × i × t \n" +
                "J (juros) = C (capital inicial) x i (juros) x t (tempo)\nFórmula para descobrir a quantia final\n" +
                "M = C + J \n" + "M = montante \n" +
                "C = capital inicial \n" +
                "J = juros (o resultado do cálculo anterior) ");
        System.out.println("=========================================================================================\n");
        double montanteJuros = 0;
        double totalAcumulado;
        double juros = 0.12;
        double limite = 10;

        double valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento R$: "));

        System.out.println("Valor do investimento R$ " + valorInvest);

        for (int i = 1; i <= limite; i++) {
            montanteJuros = valorInvest * juros + montanteJuros;
            totalAcumulado = valorInvest + montanteJuros;
            System.out.printf("\nMontante dos juros R$ %.2f", (montanteJuros));
            System.out.printf("\nValor total acumulado com juros R$ %.2f ", totalAcumulado);
        }


    }

}
