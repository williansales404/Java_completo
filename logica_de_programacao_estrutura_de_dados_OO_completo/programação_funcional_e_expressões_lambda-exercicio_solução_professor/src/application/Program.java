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
			
			double media = prod.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x , y) -> x + y) / prod.size();
			System.out.print("Average price: ");
			System.out.printf("%.2f%n" ,media);
			
			Comparator<String> comp= (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> name = prod.stream()
					.filter(p -> p.getPrice() < media)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			name.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
