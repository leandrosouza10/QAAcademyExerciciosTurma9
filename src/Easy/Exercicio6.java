package Easy;

import javax.swing.*;

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
