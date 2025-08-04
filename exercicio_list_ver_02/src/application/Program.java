package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		List<Employer> listCadastro = new ArrayList<>();
		int cont = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("Emplyoee#%d:%n", cont++);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(listCadastro, id)) {
				System.out.println("id already takem! try again ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			listCadastro.add(new Employer(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer positionID = sc.nextInt();
		Integer increaseSalaryPositionID = position(listCadastro, positionID);

		if (increaseSalaryPositionID == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enterthe percentage: ");
			Double percent = sc.nextDouble();
			listCadastro.get(increaseSalaryPositionID).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Listofemployees: ");
		for (Employer employer : listCadastro) {
			System.out.println(employer);
		}
		
		sc.close();
	}

	public static Integer position(List<Employer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employer>list, Integer id) {
		Employer emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
