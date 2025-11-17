package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.printf("Employee #%d data:%n", i + 1);
			System.out.print("Outsourced(y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Valueper hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additionalcharge: ");
				double extra = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, extra));
			} else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS:");
		for(Employee c: emp) {
			System.out.println(c.getName()+" - $ "+String.format("%.2f", c.payment()));
		}

		sc.close();
	}

}
