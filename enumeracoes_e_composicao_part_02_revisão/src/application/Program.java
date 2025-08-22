package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fomatdate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name:");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Level:");
		String level = sc.nextLine();
		System.out.print("Base salary:");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Entercontract#%d data:%n",i+1);
			System.out.print("Date (DD/MM/YYYY):");
			String datecontract = sc.next();
			System.out.print("Valueper hour:");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration(hours):");
			int duration = sc.nextInt();
			System.out.println();
			
			HourContract contracts = new HourContract(LocalDate.parse(datecontract, fomatdate), valuePerHour, duration);
			worker.addContract(contracts);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income(MM/YYYY):");
		String enterDate = sc.next();
		int month = Integer.parseInt(enterDate.substring(0, 2));
		int year = Integer.parseInt(enterDate.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+month+"/"+year+": "+worker.income(year, month));

		sc.close();
	}

}
