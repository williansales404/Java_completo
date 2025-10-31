package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.ApiVotacao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = "C:\\workspace\\generics_map_exercicio_fixacao\\in.txt";

		Map<ApiVotacao, Integer> list = new HashMap<>();

		List<ApiVotacao> listApi = new ArrayList<ApiVotacao>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] file = line.split(",");

				// list.put(new ApiVotacao(file[0], Integer.parseInt(file[1])),
				// Integer.parseInt(file[1]));

				listApi.add(new ApiVotacao(file[0], Integer.parseInt(file[1])));

				line = br.readLine();

			}
			int sumAlex = 0, sumMaria = 0, sumBob = 0;
			for (ApiVotacao c : listApi) {
				
				if (c.getName().equals("Alex Blue")) {
					sumAlex = sumAlex + c.getQuantity();
					list.put(new ApiVotacao(c.getName(), sumAlex), sumAlex);
				}
				
				if (c.getName().equals("Maria Green")) {
					sumMaria = sumMaria + c.getQuantity();
					list.put(new ApiVotacao(c.getName(), sumMaria), sumMaria);
				}
				
				if (c.getName().equals("Bob Brown")) {
					sumBob = sumBob + c.getQuantity();
					list.put(new ApiVotacao(c.getName(), sumBob), sumBob);
				}

			}

			for (ApiVotacao Key : list.keySet()) {
				System.out.println(Key.getName() + ": " + list.get(Key));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
