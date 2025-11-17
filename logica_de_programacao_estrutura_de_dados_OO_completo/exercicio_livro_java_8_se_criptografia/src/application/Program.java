package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] senha = new int[4];
		int entradaNumber = sc.nextInt();
		senha[0] = entradaNumber / 1000;
		entradaNumber %= 1000;
		senha[1] = entradaNumber / 100;
		entradaNumber %= 100;
		senha[2] = entradaNumber / 10;
		senha[3] = entradaNumber %= 10;

		for (int i = 0; i < senha.length; i++) {
			senha[i] = senha[i] + 7;
		}
		
		double []senhaEtapa2 = new double[4];
		for (int i = 0; i < senha.length; i++) {
			senhaEtapa2[i] = (double)senha[i] / 10;
		}
		
		double []senhaEtapa3 = new double[4];
		senhaEtapa3[0] = senhaEtapa2[2];
		senhaEtapa3[1] = senhaEtapa2[3];
		senhaEtapa3[2] = senhaEtapa2[0];
		senhaEtapa3[3] = senhaEtapa2[1];
		
		for (double d : senhaEtapa3) {
			System.out.println(d);
		}
		System.out.println();
		///////////////descriptografia////////////////
		double []descriptografia = new double[4]; 
		descriptografia[0] = senhaEtapa3[2];
		descriptografia[1] = senhaEtapa3[3];
		descriptografia[2] = senhaEtapa3[0];
		descriptografia[3] = senhaEtapa3[1];
		for (double d : descriptografia) {
			System.out.println(d);
		}
		System.out.println();
		for (int i = 0; i < senha.length; i++) {
			senhaEtapa3[i] = descriptografia[i] * 10 - 7;
		}
		
		int [] senhaDescriptografada = new int [4];
		for (int i = 0; i < senha.length; i++) {
			senhaDescriptografada[i] = (int)senhaEtapa3[i] * 1;
		}
		
		for (double d : senhaDescriptografada) {
			System.out.println(d);
		}
		
		sc.close();
	}

}
