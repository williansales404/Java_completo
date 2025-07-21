package entities;

import java.util.Scanner;

public class Entrada {
	Scanner sc = new Scanner(System.in);

	public void entrada() {

		System.out.print("Quantas pessoas voce vai digitar? ");

		int n = sc.nextInt();
		sc.nextLine();
		BackEnd[] vet = new BackEnd[n];

		int cont = 1;
		for (int i = 0; i < vet.length; i++) {

			System.out.printf("Dados da %da pessoa: %n", cont++);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();

			vet[i] = new BackEnd(name, age);
		}

		int maior = 0;
		String s = "s";
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getAge() > maior) {
				maior = vet[i].getAge();
				s = vet[i].getName();
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + s);

	}

}
