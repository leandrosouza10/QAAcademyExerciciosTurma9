package medium;

/* História do Usuário: Multiplicação Cumulativa com Reset

    Como um usuário, desejo um algoritmo que calcule a multiplicação cumulativa de todos os números no intervalo de 1 a
    1000. O processo deve reiniciar o resultado para 1 sempre que atingir ou ultrapassar 1000.

Critérios de Aceite:
    ○ O programa deve calcular a multiplicação cumulativa dos números de 1 a 1000.
    ○ O algoritmo deve reiniciar o resultado para 1 sempre que a multiplicação atingir ou ultrapassar 1000.
    ○ A cada iteração, o programa deve exibir o resultado parcial da multiplicação.
    ○ Se o resultado atingir ou ultrapassar 1000, o programa deve reiniciar o resultado para 1 e continuar o cálculo.
    ○ O código deve ser eficiente e não deve continuar a execução desnecessariamente */

public class Exercicio4 {

    public static void main(String[] args) {
        int resultado = 1;

        for (int i = 1; i <= 1000; i++) {
            resultado *= i;
            System.out.println("Resultado parcial: " + resultado);
            if (resultado >= 1000) {
                resultado = 1;
            }
        }
        System.out.println("Fim das multiplicações");
    }
}
