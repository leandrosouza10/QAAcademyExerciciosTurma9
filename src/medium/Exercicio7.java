package medium;

/*
    Descrição: Como um usuário, desejo um algoritmo que leia todos os meses do ano e armazene esses meses em um vetor.

    Critérios de Aceite:
    ○ O programa deve permitir a leitura de todos os meses do ano.
    ○ Os meses devem ser armazenados em um vetor.
    ○ O vetor deve ser do tipo string, permitindo o armazenamento do nome de cada mês. */


public class Exercicio7 {

    public static void main(String[] args) {

        String[] mesesAno = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto"
                , "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.println(mesesAno[i]);

        }


    }
}
