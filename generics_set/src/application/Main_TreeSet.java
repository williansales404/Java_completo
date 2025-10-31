package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main_TreeSet {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		// União ordenada dos dois conjuntos.
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b); // add conjunto 'b' no conjunto 'c'
		System.out.println(c); // TreeSet não permite elementos duplicados não repete

		// intersection
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		Set<Integer> d = new TreeSet<>(a);
		// 'd' recebe 'b' com retainAll(b) retorno a interseção
		d.retainAll(b); // elemento incomum entre eles
		System.out.println(d);

		// difference
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);// Remove de 'e' todos os elementos que também estão em 'b' (diferença: a - b).
		System.out.println(e);
	}
}
