package model.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReader {

	public WriterAndReader() {
	}

	private static String caminhoArquivo = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação\\product.csv";

	// metodo adiciona objeto no arquivo csv
	public void addProduct(Product p) {

		boolean existingFile = new File(caminhoArquivo).exists();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, existingFile))) {

			/*
			 * if (existingFile != existingFile2) { bw.write("Nome;value;Quantity\n"); }
			 */

			bw.write(p.getName() + ";" + p.getValue() + ";" + p.getQuantity() +"\n");

			bw.flush();

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// criar metodo leitura
	public List<Product> listProduct() {
		List<Product> product = new ArrayList<Product>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha;

			while ((linha = br.readLine()) != null) {

				String[] parte = linha.split(";");
				String name = parte[0];
				double value = Double.parseDouble(parte[1]);
				int quantity = Integer.parseInt(parte[2]);

				Product productRead = new Product(name, value, quantity);

				product.add(productRead);

				System.out.printf("Name: %s, Value: %.2f, Quantity: %d\n", name, value, quantity);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return product;
	}

}
