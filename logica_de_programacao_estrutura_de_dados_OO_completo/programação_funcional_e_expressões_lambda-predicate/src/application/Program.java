package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	// Interface funcional predicate
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

		// removeIf recebe um predicado expresão lambda
		/*
		 * list.removeIf(p -> p.getPrice() >= 100.0);
		 */

		// Predicate interface funcional implementado em classe retorna true ou false
		// list.removeIf(new ProductPredicate());

		// Referencemethodcom método estático
		// list.removeIf(Product::staticProductPredicate);

		// Referencemethodcom método não estático
		// list.removeIf(Product::nonStaticProductPredicate);
		/*
		 * Double min = 100.0; // poderia ser entrada do usuario //variavel do tipo
		 * predicate Predicate<Product> prod = p -> p.getPrice() >= min;
		 * list.removeIf(prod);
		 */

		// Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
