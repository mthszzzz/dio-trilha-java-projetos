import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scanner.next();

            System.out.println("Agora digite seu nome: ");
            String nomeCliente = scanner.next();

            System.out.println("Agora digite seu saldo: ");
            double saldo = scanner.nextDouble();

        System.out.printf("Olá, %s. Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.",nomeCliente, agencia, numeroConta, saldo);


    }
}
