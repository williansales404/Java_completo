package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program02 {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		/*
		 * 
		 * Utilizamos aqui "method references" :: (operador de Method Reference)
		 * Sintaxe: Classe::método
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		/*
		 * METHOD REFERENCE (::)
		 * 
		 * Sintaxe: Classe::método
		 * 
		 * É uma forma simplificada de passar um método como argumento,
		 * sendo mais concisa que uma expressão lambda completa.
		 */
		
		/*
		 * Exemplo de equivalência:
		 * 
		 * Method Reference:
		 *   list.sort(Program02::compareProducts);
		 * 
		 * É equivalente à expressão lambda:
		 *   list.sort((p1, p2) -> Program02.compareProducts(p1, p2));
		 * 
		 * Que por sua vez é equivalente a:
		 *   list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		 */	
		list.sort(Program02::compareProducts);

		list.forEach(System.out::println);

	}

}
