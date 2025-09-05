package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Product> product = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.printf("Product #%d data:%n", i + 1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char idProduct = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (idProduct == 'c') {
				product.add(new Product(name, price));
			} else if (idProduct == 'i') {
				System.out.print("Customsfee: ");
				double customsfee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsfee));
			} else if (idProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				product.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, formatt)));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product c: product) {
			System.out.println(c.priceTag());
		}
		
		sc.close();
	}

}
