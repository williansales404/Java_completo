package entities;

import java.util.ArrayList;
import java.util.List;

//Classe e do tipo generico sera definido quando o objeto for instanciado
public class PrintService<T> {

	// Meus metodos tambem são do tipo generico
	private List<T> collection = new ArrayList<>();

	public void addValue(T value) {
		collection.add(value);
	}

	public T first() {

		if (collection.isEmpty()) {
			// lança exceção se a lista for vazia
			throw new IllegalStateException("list is Empty");
		}
		return collection.get(0);
	}

	public void print() {
		System.out.print("[");
		System.out.print(collection.get(0));
		for (int i = 1; i < collection.size(); i++) {
			System.out.print(", " + collection.get(i));
		}
		System.out.println("]");
	}

}
