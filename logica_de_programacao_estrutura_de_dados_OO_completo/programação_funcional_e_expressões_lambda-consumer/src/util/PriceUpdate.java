package util;
import java.util.function.Consumer;

import entities.Product;

//Implementação de interface para implementar Consumer
public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
