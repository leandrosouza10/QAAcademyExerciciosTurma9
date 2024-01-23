package Easy;

import javax.swing.*;

/*História de Usuário: Cálculo do INSS
        Como usuário, desejo ter a capacidade de inserir meu salário, permitindo que um algoritmo calcule e exiba o valor do INSS a ser
        pago, seguindo a tabela de alíquotas progressivas.
  Critérios de Aceite:
        ○ Como usuário, posso fornecer o valor do meu salário como entrada para o algoritmo.
        ○ O algoritmo deve calcular o valor do INSS com base na tabela de alíquotas progressivas, utilizando a fórmula:
        INSS = Salário * Alíquota.
        ○ O sistema deve aplicar a alíquota correspondente ao intervalo do salário de contribuição, conforme a tabela fornecida.
        ○ O sistema deve exibir de forma clara e legível o valor do INSS a ser pago. */

public class Exercicio7 {

    public static void main(String[] args) {

        System.out.println("==================== Tabela de desconto INSS ============================");
        System.out.println("Salário de Contribuição (R$)\tAlíquota (%)\t\n" +
                "até R$ 1.412,00\t                7,5 %\t\n" +
                "de R$ 1.412,01 até R$ 2.666,68\t9,0 %\n" +
                "de R$ 2.666,69 até R$ 4.000,03\t12,0 %\n" +
                "de R$ 4.000,04 até R$ 7.786,02\t14,0 %");
        System.out.println("=========================================================================");

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário bruto"));


        if (salario <= 1412) {
            double inss = salario * 0.075;
            System.out.println("A contribuição para o INSS será de R$ " +inss);

        }
        if (salario >= 1412.01 && salario <= 2668.68) {
            double inss = salario * 0.09;
            System.out.println("A contribuição para o INSS será de R$ " + inss);

        }
        if (salario >= 2668.69 && salario <= 4000.03) {
            double inss = salario * 0.12;
            System.out.println("A contribuição para o INSS será de R$ " + inss);

        }
        if (salario >= 4000.04 && salario <= 7786.02) {
            double inss = salario * 0.14;
            System.out.println("A contribuição para o INSS será de R$ " + inss);
        }

    }

}
