package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEnd;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		BackEnd []vet = new BackEnd[n]; 
		
		double sum = 0.0;
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			
			double number = sc.nextDouble();
			vet[i] = new BackEnd(number);
			
			sum += vet[i].getNumber();
		}
		
		double media = sum / vet.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n",media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNumber() < media) {
				System.out.println(vet[i].getNumber());
			}
		}
		
		
		sc.close();
	}

}
