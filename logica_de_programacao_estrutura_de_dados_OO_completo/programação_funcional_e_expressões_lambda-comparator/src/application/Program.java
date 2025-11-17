package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// implementando o comparator em uma classe anonima
		/*
		 * default void sort(Comparator<? superE> c) metodo sort da interface List
		 * necessita da implementação da interface comparator para ordenar a lista A
		 * lista não sabe por si só como ordenar os objetos. O Comparator define o
		 * critério de ordenação.
		 */
		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); } };
		 */

		// Função anoniam com expressão lambda, aqui não precisa passar o tipo para
		// variavel no parametro
		/*
		 * Comparator<Product> comp = (p1, p2) -> { //implement da função return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); };
		 */

		// Comparator<Product> comp = (p1, p2) ->
		// p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		// Posso pegar toda expressão como argumento para o sort
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}