import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        var sc = new Scanner(System.in);
        System.out.print("Digite o número da agência! Exemplo: 1234-5: ");
        var agencia = sc.next();
        System.out.print("Digite o número da conta! Exemplo: 123456-7: ");
        var conta = sc.nextInt();
        System.out.print("Digite o nome do cliente: ");
        var nome = sc.next();
        System.out.print("Digite o saldo da conta: ");  
        var saldo = sc.nextDouble();
        System.out.printf("\n\nOlá %s, obrigado por criar uma conta em nosso banco! \nSua agência: %s \nConta: %s \nE seu saldo de R$%.2f já está disponível para saque.", nome, agencia, conta, saldo);
    }
}
