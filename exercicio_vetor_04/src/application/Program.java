package application;

import java.util.Scanner;

import entities.BackEnd;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		
		int n = sc.nextInt();
		BackEnd [] vet = new BackEnd[n];
		
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vet[i] = new BackEnd(number);
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int sum = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNumber() % 2 == 0) {
				System.out.print(vet[i].getNumber()+" ");
				sum++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES "+sum);
		
		sc.close();
	}

}
