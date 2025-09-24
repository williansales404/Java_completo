package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	// Forma manual de ler e fechar as (stream) e so um exemplo não recomendado usar
	public static void main(String[] args) {

		String path = "C:\\workspace\\in.txt";
		FileReader fr = null; // declaração de variavel e seu tipo
		BufferedReader br = null; // declaração de variavel e seu tipo

		try {
			//tenta abrir e ler o arquivo
			fr = new FileReader(path); //recebe como argumento a string com caminho do arquivo
			br = new BufferedReader(fr); //stream basica fr, br stream otimizada recebe como argumento a stream fr

			String line = br.readLine(); //ler a linha do arquivo, se estiver na linha final retorna null

			while (line != null) { //enquanto diferente de null leu com sucesso a linha
				System.out.println(line);
				line = br.readLine(); //tenta ler novamente
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

/*
 * •FileReader(streamde leitura de caracteres a partir de arquivos)
 * •https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
 * •BufferedReader(mais rápido)
 * •https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
 * •https://stackoverflow.com/questions/9648811/specific-difference-between
 * bufferedreader-and-filereader
 */