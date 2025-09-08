package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*O mais iportante e ver a classe Account não pode ser instanciada
		 *pois a classe generica e para ser reutilizada
		 *definindo uma estrutura generica*/
		
		// aqui temos uma coleção das contas do tipo gererico do tipo account
		// com instanciação de um tipo
		List<Account> acc = new ArrayList<Account>();

		acc.add(new SavingsAccount(1001, "Bob", 100.0, 40.0));
		acc.add(new BusinessAccount(1002, "Alex", 100.0, 50.0));
		acc.add(new SavingsAccount(1003, "Maria", 100.0, 10.0));
		acc.add(new BusinessAccount(1004, "Fernando", 30.0, 30.0));

		double sum = 0.0;
		for (Account c : acc) {
			System.out.println(sum += c.getBalance());
		}
		
		//Como fizemos upcasting na instanciação
		//usamos o metodo deposito para add R$10,00 nas contas
		for (Account c : acc) {
			c.deposit(10.0);
			System.out.printf("Numero da conta: %d, valor add  %.2f%n"
					, c.getNumber(), c.getBalance());
		}

	}
}
