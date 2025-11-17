package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;

import entities.User;

public class Program {

	public static void main(String[] args) {

		System.out.println("Enter file full path: ");
		String path = "C:\\workspace\\generics_exercicio\\in.txt";

		/*
		 * Esse interface cria um conjunto e ordenado pelo compareTo do objeto (ou Comparator)
		 * TreeSet não permite objetos repetidos em seu conjunto
		 */
		Set<User> user = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				// System.out.println(line);

				String[] QTD_user = line.split(" ");

				user.add(new User(QTD_user[0], Instant.parse(QTD_user[1])));

				line = br.readLine();

			}

			int cont = 0;
			for (User c : user) {
				cont++;
			}

			System.out.println("Total users: " + cont);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
