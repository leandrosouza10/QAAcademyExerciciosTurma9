package valoresComParametro;

public class ValoresComParametros {

    // COM RETORNO
    public static int exemplo1ComRetorno(int nota) {
        if (nota >= 7) {
            System.out.println("Parabéns você foi aprovado, sua nota foi " + nota);

        } else {
            System.out.println("Você foi reprovado, sua nota foi " + nota);
        }
        return nota;
    }

    public static double exemplo2ComRetorno(double valor) {
        return valor;
    }

    public static String exemplo3ComRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
        return exemplo;
    }

    public static String exemplo4ComRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
        return exemplo;
    }

    public static String exemplo5ComRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
        return exemplo;
    }

    // SEM RETORNO
    public static void exemplo1SemRetorno(int valor) {
        System.out.println(valor);
    }

    public static void exemplo2SemRetorno(double valor) {
        System.out.println(valor);
    }

    public static void exemplo3SemRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
    }

    public static void exemplo4SemRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
    }

    public static void exemplo5SemRetorno(String exemplo) {
        System.out.println("Nome do jogador: " + exemplo);
    }

    public static void main(String[] args) {

        // COM RETORNO
        System.out.println(exemplo1ComRetorno(8));
        System.out.println(exemplo2ComRetorno(20.5));
        System.out.println(exemplo3ComRetorno("Ronaldo"));
        System.out.println(exemplo4ComRetorno("Ronaldinho Gaúcho"));
        System.out.println(exemplo5ComRetorno("Rivaldo"));


        // VOID "SEM RETORNO "
        exemplo1SemRetorno(40);
        exemplo2SemRetorno(40.7);
        exemplo3SemRetorno("Roberto Carlos");
        exemplo4SemRetorno("Bebeto");
        exemplo5SemRetorno("Romário");

    }
}
