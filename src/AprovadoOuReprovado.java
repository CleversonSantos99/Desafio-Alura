import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double primeiraNota = 0, segundaNota = 0, media = 0;

        System.out.println("Primeira nota: ");
        primeiraNota = leitor.nextDouble();
        System.out.println("Segunda nota: ");
        segundaNota = leitor.nextDouble();
        media = (primeiraNota + segundaNota) / 2;
        System.out.println("MÉDIA: " + media);

        if (media >= 7) {
            System.out.println("ALUNO APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("ALUNO EM RECUPERAÇÃO");
        } else {
        System.out.println("ALUNO REPROVADO");
        }
    }
}