package easy;

import javax.swing.*;

   /* História de Usuário: Verificação de Aprovação em Disciplina
            Como usuário, desejo ter a capacidade de inserir duas notas, permitindo que um algoritmo calcule a média. Após o cálculo, o sistema deve
            determinar se a média é maior que 5, menor que 5 ou igual a 5, exibindo o status de aprovação, reprovação ou necessidade de exame.
      Critérios de Aceite:
            ○ Como usuário, posso fornecer duas notas como entrada para o algoritmo.
            ○ O algoritmo deve calcular a média das duas notas fornecidas.
            ○ Se a média for maior que 5, o sistema deve exibir "Aprovado".
            ○ Se a média for menor que 5, o sistema deve exibir "Reprovado".
            ○ Se a média for igual a 5, o sistema deve exibir "Exame".
            ○ O sistema deve exibir de forma clara e legível o resultado da verificação de aprovação */

public class Exercicio6 {

    public static void main(String[] args) {

        System.out.println("=================== Verificação de Aprovação em Disciplina =====================");

        System.out.println("Média maior que 5: APROVADO" +
                "\nMédia menor que 5: REPROVADO" +
                "\nMédia igual a 5: EXAME");
        System.out.println("================================================================================");

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.println("APROVADO: " + "Sua média foi " + media);
        }
        if (media < 5) {
            System.out.println("REPROVADO: " + "Sua média foi " + media);
        }
        if (media == 5) {
            System.out.println("EXAME: " + "Sua média foi " + media);
        }
        System.out.println("================================================================================");
    }
}
