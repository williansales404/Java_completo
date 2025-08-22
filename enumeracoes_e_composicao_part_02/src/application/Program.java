//correção do trabalho com LocalDate
//https://github.com/Vawkay/Worker_Contract/tree/main
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
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String derpartmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new entities.Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(derpartmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Entercontract#%d data:%n",i+1);
			System.out.print("Date (DD/MM/YYYY): ");
			String enterDate = sc.next();
			LocalDate date = LocalDate.parse(enterDate, format);
			//System.out.println(date);
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int durationHour = sc.nextInt();
			
			HourContract contracts = new HourContract(date, valueHour, durationHour);
			worker.addContract(contracts);
		}
		
		//System.out.printf("%.2f",worker.income(8, 2018));
		
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		
		String dateIncome = sc.next();
		int monthIncome = Integer.parseInt(dateIncome.substring(0, 2));
		int yearIncome = Integer.parseInt(dateIncome.substring(3));
		
		System.out.printf("Name: %s%n",worker.getName());
		System.out.printf("Department: %s%n",worker.getDepartment().getName());
		System.out.println("Income for "+monthIncome+"/"+yearIncome +": "+worker.income(monthIncome, yearIncome));
		//String x = "01/";
		//LocalDate formattedIcomedate = LocalDate.parse(x+dateIncome, format);
		
		
		sc.close();
	}

}
