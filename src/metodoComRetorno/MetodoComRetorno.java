package metodoComRetorno;

/*
    1- Criar uma classe;
    2- Criar 5 metodos com retorno:
    3- Adicionar uma instrução para retornar o nome do Método;
    4- Fazer a chamada destes 5 métodos em um main.
*/

public class MetodoComRetorno {

    public static String notaFinal() {
        int nota = 8;

        if (nota >= 7) {
            return "Aprovado " + nota;
        } else {
            return "Reprovado " + nota;
        }

    }

    public static String retornoDois() {
        return "MÉTODO DOIS";
    }

    public static String retornoTres() {
        return "MÉTODO TRÊS";
    }

    public static String retornoQuatro() {
        return "MÉTODO QUATRO";
    }

    public static String retornoCinco() {
        return "MÉTODO CINCO";
    }

    public static void main(String[] args) {

        System.out.println(notaFinal());
        System.out.println(retornoDois());
        System.out.println(retornoTres());
        System.out.println(retornoQuatro());
        System.out.println(retornoCinco());

    }


}
