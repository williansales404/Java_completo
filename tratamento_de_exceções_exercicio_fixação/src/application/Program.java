package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;
//solução do professor em video tratamento de exception
//https://www.youtube.com/watch?v=AiIuJqJ0r8A
//https://github.com/acenelio/exceptions2-java
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit ");
			double withdrawLimit = sc.nextDouble();
			System.out.println();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();

			account.withdraw(amount);

			System.out.println(account);
			System.out.println();

		} catch (DomainException e) {
			System.out.println(e.getMessage());
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}

}
