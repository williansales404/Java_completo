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
		
		
		List<Integer> listId = new ArrayList<>();
		List<Object> listCadastro = new ArrayList<>();
		List<Double> listSalary = new ArrayList<>();
		Employer chamaMetodo = new Employer();
		
		
		for(int i=0; i<n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employer p = new Employer(id, name, salary);
			listCadastro.add(p);
			
			listId.add(id);
			
			listSalary.add(salary);
			
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int encontrarIndex = sc.nextInt();
		int index = listId.indexOf(encontrarIndex);
		System.out.println();
		
		//System.out.println(listSalary.get(index));
		
		System.out.print("Enterthe percentage: ");
		double percent = sc.nextDouble();
		
		
		
		for(int id: listId) {
			if(id == encontrarIndex) {
				System.out.println("sim");
				double x = listSalary.get(index);
				double  = chamaMetodo.increaseSalary(x,percent);
				
			}
		}
		
		for(double sal :listSalary ) {
			System.out.println();
		}
		
		sc.close();
	}

}
