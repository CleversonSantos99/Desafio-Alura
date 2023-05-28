import java.util.Scanner;

public class ContagemProgressivaouRegressiva {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0, inicio =0, fim = 0;

        System.out.println("Início: ");
        inicio = leitor.nextInt();
        System.out.println("Fim: ");
        fim = leitor.nextInt();

        if (inicio < fim) {
            while (contador <= fim) {
                System.out.println(contador + "...");
                contador += + 1;
            }
        } else if (inicio > fim) {
            contador = inicio;
            while (contador >= fim) {
                System.out.println(contador + "...");
                contador += -1;
            }
        }
    }
}
