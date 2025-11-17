package entities;

import java.util.Locale;
import java.util.Scanner;

public class BackEndPf {
	
	private double height;
	private char gender;
	
	public BackEndPf() {
		
	}
	
	public BackEndPf(double height, char gender) {
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void enterFront() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		BackEndPf []vet = new BackEndPf[n];
		
		int contP=1;
		for(int i=0; i<vet.length; i++) {
			System.out.printf("Altura da %da pessoa: ",contP++);
			double height = sc.nextDouble();
			System.out.print("Genero da 1a pessoa: ");
			char gender = sc.next().charAt(0);
			
			vet[i] = new BackEndPf(height, gender);
		}
		
		double maior = vet[0].getHeight(), menor=vet[0].getHeight(),contF=0.0,sumF=0.0;
		int contM=0; 
		for(int i=0; i<vet.length; i++) {
			
			if(vet[i].getHeight() < menor) {
				menor = vet[i].getHeight();
			}
			else if(vet[i].getHeight() > maior) {
				maior = vet[i].getHeight();
			}
			
			if(vet[i].gender == 'f') {
				contF++;
				sumF += vet[i].getHeight();
			}
			else {
				contM++;
			}
			
		}
		
		System.out.println("Menor altura = "+menor);
		System.out.println("Maior altura = "+maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",sumF/contF);
		System.out.println("Numero de homens = "+contM);
		
		
		
		sc.close();
	}
	
	
	
}
