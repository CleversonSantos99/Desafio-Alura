import  java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = "Jaqueline";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        double saldoAtual = saldoInicial;
        int opcao = 0;
        double valoAReceber;
        double valorATransferir;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo conta:      " + tipoDeConta);
        System.out.println("Saldo inicial:   " + saldoInicial);
        System.out.println("************************************");
        System.out.println("");
        System.out.println("");

        do {
        System.out.println("Operações");
        System.out.println("");
        System.out.println("""
                1 - Consultar saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """);
        System.out.println("");
        System.out.println("Digite a opção desejada:");
        opcao = leitor.nextInt();

        if (opcao == 1) {
            System.out.println("O saldo atual é R$ " + saldoAtual);
        }

        if (opcao == 2) {
            System.out.println("Informe o valor a receber:");
            valoAReceber = leitor.nextDouble();
            saldoAtual += + valoAReceber;
            System.out.println("Saldo atualizado R$ " + saldoAtual);
        }

        if (opcao == 3) {
            System.out.println("Informe o valor que deseja transferir");
            valorATransferir = leitor.nextDouble();
                if (valorATransferir > saldoAtual) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    System.out.println("");
                } else {
                    saldoAtual += - valorATransferir;
                    System.out.println("Saldo atualizado R$ " + saldoAtual);
                }
        }

        if (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Opção inválida");
            System.out.println("");
        }

        } while (opcao != 4);
        if (opcao == 4) {
            System.out.println("Programa finalizado");
        }
    }
}
