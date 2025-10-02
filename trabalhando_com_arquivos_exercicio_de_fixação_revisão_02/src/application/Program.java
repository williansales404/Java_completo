package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		String caminhoArquivo = "C:\\workspace\\trabalhando_com_arquivos_exercicio_de_fixação_revisão_02\\product.csv";
		Creat wr = new Creat();
		while (true) {
			System.out.print("Product: ");

			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("s")) {
				break; // Encerra o programa quando ler s
			}

			String[] parte = entrada.split(", ");
			
			
			
			p = new Product(parte[0], Double.parseDouble(parte[1]), Integer.parseInt(parte[2]));
			
			wr.creatProductCsv(p, caminhoArquivo);
		}

		///////////////////////////////////////////////////////////////////////////////////////////
		// Recriar arquivo em nova pasta e com com nome e total
		File file = new File(caminhoArquivo); // Caminho se torna variavel tipo file pra usar metodo
		String fileStr = file.getParent(); // metodo getparent para usar caminho da pasta
		boolean succesFolder = new File(fileStr + "\\Out").mkdir(); // dentro da pasta parente criar outra pasta
		String newFileStr = fileStr + "\\Out\\sumary.csv"; // com pasta criada agora cria o arquivo

		List<Product> prod = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line = br.readLine(); //considerando que o arquivo tenha cabeçalho
			line = br.readLine(); // ler a ate a quebra de linha
			while (line != null) {

				String[] parte = line.split(";");

				String name = parte[0];
				Double value = Double.parseDouble(parte[1]);
				Integer qtd = Integer.parseInt(parte[2]);

				prod.add(new Product(name, value, qtd));

				line = br.readLine();
			}
			
			//no try esta com segundo argumento false por que toda vez vou extrair o arquivo e fazer total do zero
			//se não vai acumular informação nova com oque ja havia antes toda vez que roda o programa
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFileStr, false))){
				
				bw.write("NOME;TOTAL");
				bw.newLine();
				
				for(Product c: prod) {
					bw.write(c.getName()+";"+c.totalValue());
					bw.newLine();
				}
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
