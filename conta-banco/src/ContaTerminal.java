import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("digite o numero da agência: ");
        String agencia = sc.nextLine();

        System.out.println("digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("digite o saldo da conta: "); 
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta com o nosso banco , sua agencia é " + agencia 
         + " conta " + numero + " e o seu saldo é " + saldo);
    }
}
