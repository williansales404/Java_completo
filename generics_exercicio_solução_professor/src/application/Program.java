package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import entities.LogUser;

public class Program {

	public static void main(String[] args) {
		/*
		 * Preferencia pelo HashSet pois e mais rapido da coleção set e a interface Set
		 * não permite repetição
		 */
		Set<LogUser> logUser = new HashSet<>();

		System.out.println("Enter file full path: ");
		String path = "C:\\workspace\\generics_exercicio_solução_professor\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] files = line.split(" ");

				logUser.add(new LogUser(files[0], Instant.parse(files[1])));

				line = br.readLine();
			}

			/*
			 * A sacada aqui foi usar o tamnho do conjunto para conta a quantidade de
			 * ususuario no aquivo de log e como o objetivo e saber a quantidade de usuario
			 * e não quantidade de acesso podemos ignorar repetição e a interface Set faz
			 * isso
			 */
			System.out.println("Total users: " + logUser.size());

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
	}

}
