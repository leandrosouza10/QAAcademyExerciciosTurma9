package easy;

import javax.swing.*;

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

        if (salario > 0.00 && salario <= 2112) {
            System.out.println("Isento de imposto de renda:");
        }
        if (salario >= 2112.01 && salario <= 2826.65) {
            double ir = (salario * 0.075) - 158.40;
            System.out.println("O seu salário é R$ " + salario + ", e o imposto de renda a ser pago será de R$ " + ir);
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            double ir = (salario * 0.15) - 370.40;
            System.out.println("O seu salário é R$ " + salario + ", e o imposto de renda a ser pago será de R$ " + ir);
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            double ir = (salario * 0.225) - 651.73;
            System.out.println("O seu salário é R$ " + salario + ", e o imposto de renda a ser pago será de R$ " + ir);
        }
        if (salario >= 4664.69) {
            double ir = (salario * 0.275) - 884.96;
            System.out.println("O seu salário é R$ " + salario + ", e o imposto de renda a ser pago será de R$ " + ir);

        }

    }

}

