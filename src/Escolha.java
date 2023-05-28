import java.sql.SQLOutput;
import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int alternativa;
        double valor = 0;

        System.out.println("""
                __________________________
                    CRIANÇA ESPERANÇA                 
                __________________________
                Muito obrigado por ajudar!
                [1] para doar R$ 10
                [2] para doar R$ 25
                [3] para doar R$ 50
                [4] para doar outros valores
                [5] para cancelar
        """);
        alternativa = leitura.nextInt();
        switch (alternativa) {
            case 1:
                valor = 10;
                break;
            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
            case 4:
                System.out.print("Qual valor da doação? R$");
                valor = leitura.nextInt();
            case 5:
                valor = 0;
        }
        System.out.println("_______________________________");
        System.out.println("SUA DOAÇÃO FOI DE R$ " + valor);
        System.out.println("MUITO OBRIGADO!");
        System.out.println("_______________________________");
}
}
