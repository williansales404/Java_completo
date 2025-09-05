package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// System.out.print(bacc.getBalance());

		// UPCASTING ///////////////////////////////////////////////////////////////////////
		/*A conversão de SubClasse para SuperClase eu acesso as informações da SuperClasse
		 * mas não tenho acesso as informações da SubClasse neste caso os metodos*/
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		acc3.deposit(10.0);
		System.out.println(acc3.getBalance());

		// DOWNCASTING /////////////////////////////////////////////////////////////////////
		// Conversão explicita
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		System.out.println(acc4.getLoanLimit());

		// Conversão com instanceof para garantir que a variavel
		// seja da mesma instancia para conversão segura
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(10.0);
			System.out.println("Loan");
		}
		/*
		 * A conversão de SuperClasse para SubClasse acesso as informações de ambas
		 * exemplos posso usar os metodos das duas classes
		 */
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5 = new SavingsAccount(1006, "will", 11.0, 0.01);
			acc5.deposit(10.0); // metodo account
			acc5.updateBalance(); // metodo SavingsAccount
			acc5.withdraw(10.0); // metodo account
			System.out.printf("DOWNCASTING acc3: %.2f%n", acc5.getBalance());
		}
	}
}
