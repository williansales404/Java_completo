package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		print(list);
		System.out.println();
		List<String> list1 = Arrays.asList("a", "b", "c", "e");
		print(list1);

	}

	/*
	 * o tipo coringa ? faz com que o meu metodo receba um tipo generico qualquer
	 * List<?> list esse parametro vai aceitar qualquer tipo de lista como argumento
	 * para o metodo
	 * 
	 * Obeservação importante
	 * lista do tipo coring ? não pode receber valor não se pode adicionar valores a ela.
	 */
	public static void print(List<?> list) {
		// Upcating object recebe list e imprimi na tela
		for (Object obj : list) {
			System.out.print(obj);
		}
	}
}