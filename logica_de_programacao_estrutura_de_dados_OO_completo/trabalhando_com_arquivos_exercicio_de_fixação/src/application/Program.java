package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.entities.WriterAndReader;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		WriterAndReader wr = new WriterAndReader();
		
		System.out.println("Enter product list: Name, Value, Quantity");
		System.out.println("Press: s/ exit");

		Product p;

		while (true) {
			System.out.print("Product: ");

			String entrada = sc.nextLine();

			// Encerra o programa quando ler s
			if (entrada.equalsIgnoreCase("s")) {
				break;
			}

			String[] parte = entrada.split(", ");

			p = new Product(parte[0], Double.parseDouble(parte[1]), Integer.parseInt(parte[2]));

			wr.addProduct(p);

		}
		
		wr.listProduct();
		//////////////////////////////////////////////////////////////////////////////
		//List<String> product = new ArrayList<>();
		String caminhoArquivo = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação\\product.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha;

			while ((linha = br.readLine()) != null) {

				String[] parte = linha.split(";");
				String name = parte[0];
				double value = Double.parseDouble(parte[1]);
				int quantity = Integer.parseInt(parte[2]);

				double total = value * quantity;
				
				///////////////////////////////////////////////////////
				String caminho = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação";
				boolean f  = new File(caminho+"\\Out").mkdir();
				System.out.print("Directory Created Successfully: "+f);
				
				caminho = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação\\Out\\product.csv";
				boolean existingFile = new File(caminho).exists();
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, existingFile))) {

					/*
					 * if (existingFile != existingFile2) { bw.write("Nome;value;Quantity\n"); }
					 */

					bw.write(name + ";" + total+"\n");

					bw.flush();

					bw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
				////////////////////////////////////////////
			}

		}
		catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
