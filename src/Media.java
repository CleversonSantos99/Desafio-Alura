import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N1 = 0;
        int N2 = 0;

        System.out.println("Informe um número");
        N1 = leitor.nextInt();
        System.out.println("Informe um número");
        N2 = leitor.nextInt();
        double M = (N1 + N2) / 2;
        System.out.println("A média entre " + N1 + " e " + N2 + " é " + M);
    }
}
