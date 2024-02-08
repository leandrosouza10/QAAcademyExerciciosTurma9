package medium;

import javax.swing.*;

/* História do Usuário: Cálculo de Investimento com Juros Compostos

Descrição: Como um usuário interessado em investir dinheiro, desejo um algoritmo que calcule o valor de um investimento
ao longo de 10 anos, levando em consideração uma taxa de juros de 12% ao ano no regime de juros compostos.

Critérios de Aceite:
    ○ O programa deve solicitar ao usuário que insira o valor do investimento inicial.
    ○ A taxa de juros utilizada deve ser de 12% ao ano.
    ○ O algoritmo deve calcular o valor do investimento ao final de 10 anos, utilizando a fórmula de juros compostos(juros
    sobre juros). Ex: 1o ano = (1000 * 0.12) + 1000. 2o ano = (1120 * 0.12) + 1120 ...
    ○ O resultado deve incluir o valor investido inicialmente, o valor dos juros acumulados ao longo dos 10 anos e o total
    final do investimento.
    ○ O valor investido, o valor dos juros e o total devem ser exibidos de forma clara e organizada.
    ○ A exibição do resultado deve incluir mensagens indicando claramente cada componente (investimento inicial, juros,
    total).*/

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
