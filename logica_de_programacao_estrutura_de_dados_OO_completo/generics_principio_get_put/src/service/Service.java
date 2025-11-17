package service;

import java.util.List;

public class Service {
	/*
	 * Leitura: List<? extends Number>source get 
	 * Escrita add: List<? super Number> destiny put
	 * 
	 * List<? extends Number>source
	 * este parametro do metodo aceita classeNumber e subClase de Number em sua lista como argumento
	 * 
	 * List<? super Number> destiny
	 * este parametro do metodo aceita classeNumber e Superclasse de Number em sua lista como argumento
	 */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) { // leitura
			destiny.add(number); // escrita
		}
	}

	//List<?> list
	//este parametro e para ler uma lista de qualquer tipo.
	public static void print(List<?> list) { // Leitura somente get.
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}

}
