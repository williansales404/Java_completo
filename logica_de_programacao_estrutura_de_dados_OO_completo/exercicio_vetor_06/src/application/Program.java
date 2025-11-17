package application;

import java.util.Scanner;

import entities.BackEndVet;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		BackEndVet []vetA = new BackEndVet[n];
		BackEndVet []vetB = new BackEndVet[n];
		BackEndVet []vetC = new BackEndVet[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<vetA.length; i++) {
			int number = sc.nextInt();
			vetA[i] = new BackEndVet(number);
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<vetB.length; i++) {
			int number = sc.nextInt();
			vetB[i] = new BackEndVet(number);
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for(int i=0; i<vetC.length; i++) {
			//vetC[i] = vetA[i].getNumber() + vetB[i].getNumber(); //opção vetor idependente int
			//System.out.println(vetC[i]);
			vetC[i] = new BackEndVet(vetA[i].getNumber()+vetB[i].getNumber());
			System.out.println(vetC[i].getNumber());
		}
		
		sc.close();
	}

}
