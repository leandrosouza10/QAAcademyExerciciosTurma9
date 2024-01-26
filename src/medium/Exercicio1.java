package medium;

/*Faça um algoritmo para verificar e exibir de 0 a 100, quais são os números pares ou impares.*/


public class Exercicio1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("O Número " + i + " é par");
            } else {
                System.out.println("O Número " + i + " é impar");
            }
        }
    }
}

