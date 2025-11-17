package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//sintaxe opicional para correr coleção
	
		
		
		String [] vet = new String[] {"maria", "marcia", "curica"};
			
		System.out.println("ler nome");
		for(int i=0; i<vet.length; i++) {
			
			System.out.println(vet[i]);
		}
		
		System.out.println("==================================");
		
		for(String valor : vet) {
			System.out.println(valor);
		}
		
		
		sc.close();
	}

}
