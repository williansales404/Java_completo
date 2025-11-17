package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SistemaBancario;

public class ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder:");
		 sc.nextLine();
		String name = sc.nextLine();
		
		//contrutor obrigando inicializar variavel de instancia
		SistemaBancario accountTeste;
		
		System.out.print("Is therena initial deposit (y/n)? ");
		char depositEntry = sc.next().charAt(0);
		
		if(depositEntry == 'y') {
			System.out.print("Enter initial deposit value: ");
			
			double initialDeposit =sc.nextDouble();
			accountTeste = new SistemaBancario(account, name, initialDeposit);
		}
		else {
			accountTeste = new SistemaBancario(account, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(accountTeste);
		System.out.println();
		
		System.out.print("Enter a depositvalue: ");
		double deposit = sc.nextDouble();
		accountTeste.depositAccount(deposit);
		System.out.println("Updated account data:");
		System.out.println(accountTeste);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double sake = sc.nextDouble();
		accountTeste.sakeAccount(sake);
		System.out.println("Updated accountdata:");
		System.out.println(accountTeste);
		
		
		
		sc.close();
	}

}
