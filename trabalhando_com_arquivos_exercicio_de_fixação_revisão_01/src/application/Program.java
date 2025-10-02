package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Creat;
import model.entities.Product;

//solução professor
//https://github.com/devsuperior/aulao002
//https://www.youtube.com/watch?v=xLDViuYlqGM&t=7s

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product list: Name, Value, Quantity");
		System.out.println("Press: s/ exit");
		Product p;

		// Aqui crio o objeto criando o arquivo do zero.
		String caminhoArquivo = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação_revisão\\product.csv";
		Creat wr = new Creat();
		while (true) {
			System.out.print("Product: ");

			String entrada = sc.nextLine();

			// Encerra o programa quando ler s
			if (entrada.equalsIgnoreCase("s")) {
				break;
			}

			String[] parte = entrada.split(", ");

			p = new Product(parte[0], Double.parseDouble(parte[1]), Integer.parseInt(parte[2]));

			wr.creatProductCsv(p, caminhoArquivo);
		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		// Recriar arquivo em nova pasta e com nome e total
		File file = new File(caminhoArquivo);
		String fileStr = file.getParent();
		boolean succesFolder = new File(fileStr +"\\Out").mkdir();
		String newFileStr = fileStr + "\\Out\\sumary.csv";
		
		List<Product> product = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				String [] parte = line.split(";");
				
				String name = parte[0];
				double value = Double.parseDouble(parte[1]);
				int quantity = Integer.parseInt(parte[2]);
				
				product.add(new Product(name, value, quantity));
				
				line = br.readLine();
				
				boolean existingFile = new File(caminhoArquivo).exists();
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFileStr, existingFile))) {

					for(Product listProduct: product) {
						bw.write(listProduct.getName()+";"+String.format("%.2f", listProduct.totalValue()));
						bw.newLine();
					}
					
					System.out.println(newFileStr + ": Creat");

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
