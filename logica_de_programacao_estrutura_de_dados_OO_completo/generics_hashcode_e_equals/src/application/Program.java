package application;

import service.Authentication;

public class Program {

	public static void main(String[] args) {

		Authentication at1 = new Authentication("Alex gren", "alex@gmail.com");
		Authentication at2 = new Authentication("Alex gren", "alex@gmail.com");
		Authentication at3 = new Authentication("Maria blue", "Maria@gmail.com");

		System.out.println(at1.hashCode()); // retorna o numero hashCode
		System.out.println(at2.hashCode());
		System.out.println(at3.hashCode());
		System.out.println();
		System.out.println(at1.equals(at2)); // Compara dois objetos
		System.out.println(at1.equals(at3));
		System.out.println();
		System.out.println(at1 == at2); // Compara a referencia da memoria de dois objeto
		System.out.println();
		String a = "teste";
		String b = "teste";
		System.out.println(a == b);
		/*
		 * Literais em java tem tratamento especial quando o compilador identifica dois
		 * literais igual ele cria somente um objeto na memoria
		 * Isso não se a aplica a instancia de new String("Texto");
		 */
	}

}
