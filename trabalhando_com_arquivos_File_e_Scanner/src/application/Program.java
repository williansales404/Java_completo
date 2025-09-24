package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\workspace\\in.txt"); // ler o arquivo atraves do caminho que recebe
		Scanner sc = null; // declara a variavel da classe Scanner
		try {
			sc = new Scanner(file); // instancia Scanner para ler file
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine()); // ler a proxima linha do arquivo
			}
		} catch (IOException e) { // exceção patrão para entrada e saida de arquivo
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close(); // finaliza o programa se o Scanner realmente leu o arquivo mesmo com exceção
			}
		}
	}
}
// File -Representação abstrata de um arquivo e seu caminho
// https://docs.oracle.com/javase/10/docs/api/java/io/File.html
// Scanner -Leitor de texto
// https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
// IOException(Exception)
// https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html