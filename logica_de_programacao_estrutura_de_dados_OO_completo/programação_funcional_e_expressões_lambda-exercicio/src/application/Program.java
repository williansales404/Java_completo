package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter full file path: ");
		String path = "C:\\workspace\\programação_funcional_e_expressões_lambda-exercicio\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product> prod = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {

				String[] file = line.split(",");
				String name = file[0];
				double price = Double.parseDouble(file[1]);

				prod.add(new Product(name, price));

				line = br.readLine();
			}

			double media = prod.stream().mapToDouble(Product::getPrice).average().orElse(0.0);
			System.out.print("Average price: ");
			System.out.printf("%.2f%n", media);

			List<Product> name = prod.stream().filter(p -> p.getPrice() < media)
					.sorted(Comparator.comparing(Product::getName, Comparator.reverseOrder()))
					.collect(Collectors.toList());

			for (Product p : name) {
				System.out.println(p.getName());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
