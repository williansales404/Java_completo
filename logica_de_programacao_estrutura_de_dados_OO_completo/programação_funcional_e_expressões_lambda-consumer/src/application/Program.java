package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	// Interface funcional Consumer
	/*
	 * Sim, toda vez que você usa uma expressão lambda em Java, você está
	 * necessariamente usando uma interface funcional.
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Poderia ser lido pelo usuario
		double factor = 1.1;
		// Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};

		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}
}
