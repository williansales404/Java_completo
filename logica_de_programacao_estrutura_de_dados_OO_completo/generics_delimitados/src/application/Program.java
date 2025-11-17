package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import service.CalculationService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String path = "C:\\workspace\\generics_delimitados\\in.txt";

		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] files = line.split(",");
				list.add(new Product(files[0], Double.parseDouble(files[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max");
			System.out.println(x);
			
		} catch (IOException e) {
			e.getMessage();
		}

		sc.close();
	}
}
