import java.util.Scanner;

public class SeSenao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n;

        System.out.println("Digite um número qualquer");
        n = leitor.nextInt();
        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par");
        } else {
            System.out.println("O número " + n + " é impar");
        }
    }
}
