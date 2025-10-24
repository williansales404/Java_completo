package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrintService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many values?: ");
		int n = sc.nextInt();

		// Minha classe e do tipo generica aceita um tipo qualquer
		PrintService<String> ps = new PrintService<>();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();

		System.out.println("First: " + ps.first());

		sc.close();
	}
}
