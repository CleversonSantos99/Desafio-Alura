import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 1;
        int n, s = 0, maior = 0;

        while (contador <= 5) {
            System.out.println("Digite o " + contador + "º valor: ");
            n = leitor.nextInt();
            if (n > maior) {
                maior = n;
            }
            s += + n;
            contador += + 1;
        }
        System.out.println("A soma de todos os valores foi: " + s);
        System.out.println("O maior valor digitado foi: " + maior);
    }
}
