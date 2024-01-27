package easy;

import javax.swing.*;

/*História de Usuário: Cálculo do Salário Líquido com Imposto de Renda
        Como usuário, desejo inserir meu salário para que um algoritmo calcule e exiba o valor do salário bruto, do salário líquido e do imposto de renda a
        ser pago, seguindo a tabela de alíquotas e deduções.
Critérios de Aceite:
        ○ Como usuário, posso fornecer o valor do meu salário como entrada para o algoritmo.
        ○ O algoritmo deve calcular o valor do salário bruto, considerando o salário fornecido pelo usuário.
        ○ O sistema deve calcular o valor do imposto de renda utilizando a fórmula:
        IR = (Salário * Alíquota) - Dedução,
        conforme a tabela de alíquotas e deduções fornecida.
        ○ O salário líquido deve ser calculado subtraindo o valor do imposto de renda do salário bruto.
        ○ O sistema deve aplicar a alíquota e dedução correspondentes ao intervalo do salário bruto, conforme a tabela fornecida.
        ○ O sistema deve exibir de forma clara e legível o valor do salário bruto, do salário líquido e do imposto de renda a ser pago.*/

public class Exercicio8 {

    public static void main(String[] args) {

        System.out.println("==================================================================");
        System.out.println("Base de Cálculo (RS)            \tAlíquota (%)  \tParcela a Deduzir do IR (R$)\n" +
                "Até 2.112,00                    \tzero         \tzero\n" +
                "De 2.112,01 até 2.826,65         \t7,5          \t158,40\n" +
                "De 2.826,66 até 3.751,05          \t15           \t370,40\n" +
                "De 3.751,06 até 4.664,68           \t22,5         \t651,73\n" +
                "Acima de 4.664,68                 \t27,5         \t884,96\n");
        System.out.println("=====================================================================");

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário R$:"));
        double ir = 0;
        if (salario > 0.00 && salario <= 2112) {
            System.out.println("Isento de imposto de renda:");
        }
        if (salario >= 2112.01 && salario <= 2826.65) {
            ir = salario * 0.075 - 158.40;

        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            ir = salario * 0.15 - 370.40;

        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            ir = salario * 0.225 - 651.73;

        }
        if (salario >= 4664.69) {
            ir = salario * 0.275 - 884.96;

        }

        System.out.println("O seu salário é R$ " + salario + ", e o imposto de renda a ser pago será de R$ " + ir);

    }

}

