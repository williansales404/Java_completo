package service;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<T>> T max(List<T> list) {

		if (list.isEmpty()) {
			throw new IllegalStateException("List Empty");
		}

		T max = list.get(0);
		for (T item : list) {
			//metodo compareTo esta sendo chamado da classe product 
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
/*
 * Por que usar método genérico aqui? 
 * Flexibilidade: O método max() pode trabalhar com qualquer tipo que implemente Comparable 
 * Reutilização: Não precisamos criar uma classe para cada tipo 
 * Simplicidade: O tipo é determinado na chamada do método
 */