package easy;

import javax.swing.*;

    /*Faça um algoritmo para ler um número inteiro, somar 2 ao número digitado,
     até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
     completar 100 iterações.*/


public class Exercicio11 {


    public static void main(String[] args) {

        int numero = Integer.parseInt((JOptionPane.showInputDialog("Digite um número: ")));

        for (int i = 0; i <= 100; i++) {
            numero = numero + 2;
            System.out.println(numero + " + 2");

        }
    }
}

