package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Registro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Registro [] vet = new Registro[n];
		
		for(int i=0; i<vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double valor = sc.nextDouble();
			vet[i] = new Registro(name,valor);
		}
		
		double sum = 0;
		for(int i=0; i<vet.length; i++) {
			sum += vet[i].getValor();
		}
		
		System.out.println(sum / vet.length);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
