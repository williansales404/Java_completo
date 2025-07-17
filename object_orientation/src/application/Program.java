package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Triangle e um tipo assim como double, sendo Triangle do composto 
		 * pois Triangle tem 3 atributos a,b,c
		 */
		
		//variavel do tipo triangle
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println(" Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println(" Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Triangle X area: %.4f%n",areax);
		System.out.printf("Triangle Y area: %.4f%n",areay);
		
		if(areax>areay) {
			System.out.println(" Larger area: X");
		} else{
			System.out.println(" Larger area: Y");
		}
		
		
		
		sc.close();
		
	}

}
