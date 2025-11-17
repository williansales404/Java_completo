package util;

import java.util.function.Function;

import entities.Product;

//Implementação de interface para implementar Function
public class UpperCaseName implements Function<Product, String> {

	/*
	 * Function tem dois tipo: tipo entrada e tipo saida neste caso fico assim
	 * Function<Product, String>
	 */
	@Override
	public String apply(Product p) {
		//entrada objeto product saida string
		return p.getName().toUpperCase();
	}

}
