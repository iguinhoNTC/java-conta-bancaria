import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        // TO DO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal

        System.out.println("Bem-vindo(a) ao nosso Banco");
		System.out.println();

		System.out.println("Por favor, digite o numero da Conta:");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agencia:");
		agencia = sc.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = sc.nextDouble();
        

        //Exibir a mensagem conta criada

        System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agencia e %s, "
				+ "conta %d e seu saldo %.2f ja esta disponivel"
				+ " para saque.", nomeCliente, agencia, numero, saldo);
    }
}