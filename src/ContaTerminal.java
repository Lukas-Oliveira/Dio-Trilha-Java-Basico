import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args) throws Exception
    {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        float saldo;

        System.out.print("Digite o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = entrada.nextLine();

        System.out.print("Informe o numero da conta: ");
        numero = Integer.parseInt(entrada.next());

        System.out.print("Informe o saldo da conta: ");
        saldo = Float.parseFloat(entrada.next());

        System.out.println(
            "Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, "+
            "sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +
            " já está disponível para saque."
        );

        entrada.close();
    }
}
