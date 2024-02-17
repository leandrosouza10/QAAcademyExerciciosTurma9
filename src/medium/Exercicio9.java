package medium;
/*

Descrição: Como um usuário, desejo um algoritmo que me permita associar nomes de alunos a números correspondentes,
    armazenando essas informações em dois vetores e exibindo o nome e o número correspondente de cada aluno.

Critérios de Aceite:
    ○ O programa deve permitir a leitura e armazenamento dos nomes dos alunos em um vetor.
    ○ O programa deve permitir a leitura e armazenamento da numeração correspondente de cada aluno em um segundo vetor.
    ○ A numeração do aluno deve ser randômica, entre 0 e 100.
    ○ Os nomes e os números devem ser associados na ordem em que são inseridos.
    ○ A exibição dos resultados deve apresentar claramente o nome e o número correspondente de cada aluno.
    ○ Se nenhum aluno for inserido, o programa deve exibir uma mensagem indicando que não há alunos para serem mostrados.
     */

import javax.swing.*;
import java.util.Random;

public class Exercicio9 {

    public static void main(String[] args) {

        String[] nomeAlunos = new String[6];
        int[] numeroAlunos = new int[6];
        Random random = new Random();

        for (int i = 0; i < nomeAlunos.length; i++) {
            nomeAlunos[i] = JOptionPane.showInputDialog("Digite um nome para o " + (i + 1) + "º aluno: ");
            numeroAlunos[i] = random.nextInt(100);
            System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
        }
        if (nomeAlunos[0] == null || nomeAlunos[0].isEmpty()) {
            System.out.println("Não há alunos para serem mostrados");
        } else {
            for (int i = 0; i < nomeAlunos.length; i++) {
                System.out.println("Nome do Aluno: " + nomeAlunos[i] + " - Número: " + numeroAlunos[i]);
            }
        }
    }
}
