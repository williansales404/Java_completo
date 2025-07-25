package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEnd;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");

		int n = sc.nextInt();
		sc.nextLine();
		BackEnd[] vet = new BackEnd[n + 1];

		double sum = 0.0;
		int cont = 0;

		for (int i = 1; i < vet.length; i++) {

			System.out.printf("Dados da %da pessoa:%n", i);

			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();

			vet[i] = new BackEnd(name, age, height);

			sum += vet[i].getHeight();
			cont++;

			// System.out.println(vet[i].getName()+"-"+vet[i].getAge()+"-"+vet[i].getHeight());
		}
		
		
		System.out.println();
		double media = sum / cont;
		System.out.printf("Altura média: %.2f%n", media);

		int contMin = 0;
		int conTotal = 0;

		for (int i = 1; i < vet.length; i++) {
			if (vet[i].getAge() < 16) {
				contMin++;
			}
				conTotal++;
		}
		
		double percent = (double)contMin/conTotal*100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 1; i < vet.length; i++) {
			if (vet[i].getAge() < 16) {
				System.out.println(vet[i].getName());
			}
		}
		
		
		sc.close();
	}

}
