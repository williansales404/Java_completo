package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_HashSet {
	public static void main(String[] args) {
		
		
		Set<Integer> a = new HashSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		// União ordenada dos dois conjuntos.
		Set<Integer> c = new HashSet<>(a);
		c.addAll(b); // add conjunto 'b' no conjunto 'c'
		System.out.println(c);// HashSet não garante ordenação, mas não permite duplicatas

		// intersection
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		Set<Integer> d = new HashSet<>(a);
		// 'd' recebe 'b' com retainAll(b) retorno a interseção
		d.retainAll(b); // elemento incomum entre eles
		System.out.println(d);

		// difference
		// O construtor recebe o conjunto 'a' como argumento e cria uma cópia de 'a'.
		Set<Integer> e = new HashSet<>(a);
		e.removeAll(b);// Remove de 'e' todos os elementos que também estão em 'b' (diferença: a - b).
		System.out.println(e);
	}
}
