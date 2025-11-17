package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	// Interface funcional predicate
	/*
	 * Sim, toda vez que você usa uma expressão lambda em Java, você está
	 * necessariamente usando uma interface funcional.
	 */
	public static void main(String[] args) {

		// List original e de Product
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * A função "map" (não confunda com a estrutura de dados Map) é uma função que
		 * aplica uma função a todos elementos de uma stream.
		 */

		/*
		 * Objetivo converter lista origina Product para uma lista de String caixa Alta
		 * map vai andar em cada elemento da lsita e aplicar na strings o metodo
		 * UpperCaseName. OBS: map so funciona para stream
		 */
		
		//Converte list para strem para deixa a string da list em caixa alta
		//Apos aplica caixa alta converto stream para list novamente
		//map pega uma coleção de valores e aplica o metodo passado como argumento
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}
}
