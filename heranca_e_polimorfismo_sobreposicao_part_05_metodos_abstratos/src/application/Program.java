package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> areas = new ArrayList<Shape>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Shape #%d data:%n", i + 1);
			System.out.print("Rectangle or Circle (r/c)?");
			char enterType = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			if (enterType == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				areas.add(new Rectangle(color, width, height));
			} else if (enterType == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				areas.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape r: areas) {
			System.out.printf("%.2f%n",r.area());
		}

		sc.close();
	}
}
