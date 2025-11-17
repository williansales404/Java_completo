package util;
import java.util.function.Predicate;

import entities.Product;

//Implementação de interface para implementar predicate
public class ProductPredicate implements Predicate<Product>{
	
	//Predicate interface funcional implementado em classe retorna true ou false
	//Somente um metodo abstrato a ser implementado
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
	
}
