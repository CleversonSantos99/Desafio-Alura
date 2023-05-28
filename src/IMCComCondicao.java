import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class IMCComCondicao {
    private static Math Match;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double massa = 0;
        double altura = 0;
        double imc = 0;

        System.out.println("Massa (kg): ");
        massa = leitor.nextDouble();
        System.out.println("Altura (m): ");
        altura = leitor.nextDouble();
        imc = massa / (Match.pow(altura, 2));
        System.out.println("IMC: " + imc);


        if (imc < 17) {
            System.out.println("Você esta muito abaixo do peso");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Você esta abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você esta no peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você esta com sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Você esta obeso");
        } else if (imc >= 35 && imc <40) {
            System.out.println("Você esta com obesidade");
        } else if (imc >= 40) {
            System.out.println("Você esta com Obesidade Mórbida");
        }
    }
}
