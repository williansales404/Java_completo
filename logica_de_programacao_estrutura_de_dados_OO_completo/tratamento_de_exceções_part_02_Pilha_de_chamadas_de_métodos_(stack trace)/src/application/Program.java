package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End od Program");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html
		System.out.println("***METHOD2 START***");

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position!");
			/*printa na tela o rastreamento do erro
			 *abaixo vai mostra a sequencia de chamada que gera a exceção
			 *obs: essa print não e por que o programa quebro, e so um print
			 *apos o tratamento de exceção*/
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("***METHOD2 END***");
		sc.close();
	}
}
