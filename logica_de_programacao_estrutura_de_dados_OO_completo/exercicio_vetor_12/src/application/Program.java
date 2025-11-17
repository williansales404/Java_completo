package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BackEndPencionato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BackEndPencionato[] vet = new BackEndPencionato[10];
		
		System.out.print("How many roomswill berented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.printf("Rent #%d:%n",i);
			
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int position = sc.nextInt();
			
			vet[position] = new BackEndPencionato(name, email, position);
			
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			//System.out.println(vet[i].getName()+", "+vet[i].getEmail()+", "+vet[i].getPosition());
			if(vet[i] != null) {
				System.out.printf(
						"Quarto: "+vet[i].getPosition()+"%n"
						+"Nome: "+vet[i].getName()+", %n"
						+"Email: "+vet[i].getEmail()+", %n");
			}
			//este else não e necessario mas coloquei por moastra os quarta vazio faz sentido
			else {
				System.out.printf("Quarto %d vazio%n",i);
			}
		}
		
		sc.close();
		
	}

}
