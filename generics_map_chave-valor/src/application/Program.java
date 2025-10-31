package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		/*
		 * Cria coleção chave e valor.
		 * Mantém os elementos ordenados por suas chaves.
		 */ 
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria"); //put adiciona chave e valor a coleção
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email"); //remove remove o valor pela sua chave
		
		//reescreve o valor pois a coleção não aceita valor repetido
		cookies.put("phone", "99771133"); 
		
		//Verifica se contem um valor na coleção pela sua chave
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		//Pega o valor da coleçaõ pela chave usando metodo get
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		
		//tamanho da coleão
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		
		//Estrutura for para ler coleção chave valor
		//Ler chave primeiramente
		//.keySet() retorna as chave da coleção
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
