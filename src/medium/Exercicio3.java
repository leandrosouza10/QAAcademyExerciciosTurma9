package medium;
/* História do Usuário: Soma Cumulativa com Limite

Como um usuário, desejo um algoritmo que calcule a soma cumulativa de todos os números no intervalo de 0 a 1000. O
processo deve parar assim que a soma atingir ou ultrapassar 1500.

Critérios de Aceite:
    ○ O programa deve calcular a soma cumulativa dos números de 0 a 1000. EX: 0 +1, 1+2, 3+4.. 1500
    ○ O algoritmo deve parar imediatamente assim que a soma atingir ou ultrapassar 1500.
    ○ A cada iteração, o programa deve exibir a soma parcial acumulada.
    ○ Se a soma ultrapassar 1500, o programa deve interromper imediatamente e exibir uma mensagem indicando o
    término do processo.
    ○ O código deve ser eficiente e não deve continuar a execução desnecessariamente após atingir o limite de 1500.
    ○ A exibição da soma cumulativa deve ser clara e organizada.*/


public class Exercicio3 {

    public static void main(String[] args) {

        int limite = 1500;
        int soma = 0;

        for (int i = 0; i <= 1000; i++) {
            soma += i;
            System.out.println("Iteração : " + i + " | Soma: " + soma);
            if (soma >= limite) {
                break;
            }

        }
        System.out.println("Limite Atingido!!!");
    }
}
