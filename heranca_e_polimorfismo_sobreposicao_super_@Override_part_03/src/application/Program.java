package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1000, "Felca", 100.0);
		acc.withdraw(5.0);
		System.out.println(acc.getBalance());
		
		//metodo sobrescrito sem taxa
		Account acc1 = new SavingsAccount(1001, "Bill", 100.0, 0.1);
		acc1.withdraw(5.0);
		System.out.println(acc1.getBalance());
		
		//metodo sobrecrito com taxa + taxa de acount sando super
		Account acc2 = new BusinessAccount(1002, "Alex", 100.0, 100.0);
		acc2.withdraw(10.0);
		System.out.println(acc2.getBalance());
		
		/*Acima venos um exemplo de polimorfismo onde as variaveis são do mesmo tipo
		 *mas o objeto especifico e diferente assim como seu comportamento
		 *resumindo polimorfismo e dar varias formas.*/
		
	}
}
