package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEndNumber;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = sc.nextInt();
		BackEndNumber [] vet = new BackEndNumber[n];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vet[i] = new BackEndNumber(number);
		}
		System.out.println();
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNumber() < 0) {
				System.out.println(vet[i].getNumber());
			}
		}
		
		sc.close();

	}

}
