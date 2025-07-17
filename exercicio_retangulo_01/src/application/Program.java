package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		
		Rectangle result = new Rectangle();
		
		result.width = sc.nextDouble();
		result.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n",result.area());
		System.out.printf("PERIMETER = %.2f%n",result.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",result.diagonal());
		
		
		sc.close();
	}

}
