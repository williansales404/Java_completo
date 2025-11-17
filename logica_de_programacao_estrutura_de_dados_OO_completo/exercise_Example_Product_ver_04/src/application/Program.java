package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		product.setName("PC");
		System.out.println("update "+ product.getName());
		product.setPrice(1000);
		System.out.println("update "+ product.getPrice());
		
		System.out.println();
		System.out.println("Product data: "+product);
		
		System.out.println();
		System.out.print("Enterthe number ofproductstobe added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+product);
	
		System.out.println();
		System.out.print("Enterthe number ofproductstobe removedfrom stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: "+product);
		
		
		sc.close();
	}

}
