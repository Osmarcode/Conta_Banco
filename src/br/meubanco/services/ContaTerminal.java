package br.meubanco.services;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe por favor o número da Conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o seu primeiro nome ");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o sobrenome ");
		String sobrenome = scanner.next();
		
		System.out.println("Digita o valor para o saldo da Conta !");
		double saldoConta = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, " + "sua agência é "
		+ agencia + ", conta " + numeroConta + " e seu saldo $" + saldoConta + " já está disponível para saque.");
		
	}	
}
