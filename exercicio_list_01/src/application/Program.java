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
		
		List<Employer> listCadastro = new ArrayList<>();
		int cont=1;
		for(int i=0; i<n; i++) {
			System.out.printf("Emplyoee#%d:%n",cont++);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			listCadastro.add(new Employer(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		Integer encontrarIndex = sc.nextInt();
		//Integer x = listCadastro.get(0).getId().compareTo(encontrarIndex);
		
		Integer x=0;
		Integer position=-1;
		for(int i=0; i<n; i++) {
			x = listCadastro.get(i).getId().compareTo(encontrarIndex);
			if(x == 0) {
				position = i;
			}
		}
		
		Double percent = 0.0;
		if(position >= 0) {
			System.out.print("Enterthe percentage: ");
			percent = sc.nextDouble();
			listCadastro.get(position).increaseSalary(listCadastro.get(position).getSalary(),percent);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		for (Employer employer : listCadastro) {
			System.out.println(employer);
		}
		
		sc.close();
	}

}
