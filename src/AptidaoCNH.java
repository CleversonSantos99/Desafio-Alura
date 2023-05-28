import java.util.Scanner;

public class AptidaoCNH {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ano = 0, nasc = 0, idade = 0;

        System.out.println("Ano atual (yyyy): ");
        ano = leitor.nextInt();
        System.out.println("Ano de nascimento (yyyy): ");
        nasc = leitor.nextInt();
        idade = ano - nasc;
        System.out.println("IDADE: " + idade + " anos");
        if (idade >= 18) {
            System.out.println("APTO A TIRAR A CARTEIRA");
        } else {
            System.out.println("INAPTO A TIRAR A CARTEIRA");
        }
    }
}