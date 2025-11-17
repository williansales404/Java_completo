package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = "C:\\workspace\\generics_map_exercicio_fixacao\\in.txt";

		Map<String, Integer> list = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] file = line.split(",");

				String name = file[0];
				int quantity = Integer.parseInt(file[1]);

				/*
				 * Após criar a coleção com a primeira chave e valor aqui vou fazer a comparação
				 * se a próxima chave ela existe dentro da lista caso não exista vamos para else
				 * adiciona a chave e valor a coleção mas isso é só se a chave valor ainda não existe
				 * dentro da coleção
				 */
				if (list.containsKey(name)) {
					/*
					 * Chave existe na coleção primeiro extrai o valor já armazenado na coleção após
					 * extrair valor somo o valor no segundo argumento da coleção garantindo que
					 * mesmo se os dados for repetido não perco o inteiro
					 */
					int newValue = list.get(name); // pega valor já armazenado
					list.put(name, newValue + quantity); //reescreve valor a coleção pois a chave já existe na coleção
					//Mas o valor é somado no segundo argumento
				} else {
					/* Aqui adicionamos as chave e valor não existentes na coleção */
					list.put(name, quantity);//aqui adiciona todo valor não existente na coleção

				}
				
				line = br.readLine();
			}
			
			//ler a coleção ja criada
			for (String Key : list.keySet()) {
				System.out.println(Key + ": " + list.get(Key));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
