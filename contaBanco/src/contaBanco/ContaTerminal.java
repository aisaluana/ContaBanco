package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Como é seu nome? ");
		String Nome = sc.next();
		sc.nextLine();
		
		System.out.println("E qual sua agência? ");
		String Agencia = sc.next();
		sc.nextLine();
		
		System.out.println("E qual sua conta? ");
		Integer Conta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("E qual seu saldo?");
		Double Saldo = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("Pronto, " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta +" e seu saldo de R$" + Saldo +" já está disponível para saque");
		

	}

}
