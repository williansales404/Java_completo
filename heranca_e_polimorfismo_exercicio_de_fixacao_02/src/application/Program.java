package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.Person;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> personType = new ArrayList<Person>();

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data:%n", i + 1);
			System.out.print("Individual or company(i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				personType.add(new NaturalPerson(name, annualIncome, health));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				personType.add(new LegalEntity(name, annualIncome, employee));
			}

		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for(Person c: personType) {
			System.out.printf("%s: $ %.2f%n",c.getName() ,c.incomeTax());
			sum += c.incomeTax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n",sum);
		
		sc.close();
	}
}
