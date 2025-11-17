package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEnd;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		
		int n = sc.nextInt();
		BackEnd [] vet = new BackEnd[n];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vet[i] = new BackEnd(number);
		}
		
		System.out.println();
		System.out.print("VALORES ");
		
		double sum = 0.0;
		for(int i=0; i<vet.length; i++) {
			System.out.print(vet[i].getNumber()+" ");
			sum += vet[i].getNumber();
		}
		
		System.out.println();
		System.out.println("SOMA = "+sum);
		System.out.println("MEDIA = "+sum/vet.length);
		sc.close();

	}

}
