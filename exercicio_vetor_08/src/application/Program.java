package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEndPar;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		BackEndPar []vet = new BackEndPar[n];
		
		for(int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			int numberPar = sc.nextInt();
			vet[i] = new BackEndPar(numberPar);
		}
		
		int sum = 0;
		int cont = 0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i].getNumber() % 2 == 0) {
				sum += vet[i].getNumber();
				cont++;
			}
		}
		
		if(sum > 0) {
			double media = (double)sum/cont;
			System.out.printf("MEDIA DOS PARES = %.1f",media);
		} else{
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
	}

}
