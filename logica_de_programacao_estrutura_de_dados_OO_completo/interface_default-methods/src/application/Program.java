package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.BrasilInterestService;
import model.service.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade: ");
		double amount = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		InterestService bs = new BrasilInterestService(2.0);
		System.out.printf("Pagament apos %d meses%n",months);
		System.out.printf("%.2f%n",bs.payment(amount, months));
		
		
		
		sc.close();
	}

}
