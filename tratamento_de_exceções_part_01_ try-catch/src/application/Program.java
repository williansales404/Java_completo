package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position!");
		}
		catch(InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("End od Program");
		sc.close();
	}

}
