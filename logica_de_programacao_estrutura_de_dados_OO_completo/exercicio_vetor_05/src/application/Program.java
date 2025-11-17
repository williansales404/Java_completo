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
		
		BackEndNumber []vet = new BackEndNumber[n];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vet[i] = new BackEndNumber(number);
		}
		
		
		double max = 0.0;
		int index = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNumber() > max) {
				max = vet[i].getNumber();
				index = i;
			}
		}
		
		System.out.println("MAIOR VALOR = "+max);
		System.out.println("POSICAO DO MAIOR VALOR = "+index);
		
		sc.close();
		
	}

}
