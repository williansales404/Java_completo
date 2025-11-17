package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Caminho do arquivo");
		String strPath = sc.nextLine(); //ler o caminho da pastas e arquivo como string
		
		File path = new File(strPath); // variavel do tipo file recebe caminho de pasta es arquivos como string
		
		File [] foldes = path.listFiles(File::isDirectory); //vetor mostra pastas do caminho que recebe
		System.out.println("FOLDES:");
		for(File f: foldes) {
			System.out.println(f);
		}
		System.out.println();
		System.out.println("FILES:");
		File[] file = path.listFiles(File::isFile); //vetor mostra arquivos do caminho que recebe
		for(File c: file) {
			System.out.println(c);
		}
		System.out.println();
		boolean success = new File(strPath+"\\PastaTestJava").mkdir(); // cria uma pasta
		System.out.print("Directory Created Successfully:"+success);
		System.out.println();
		sc.close();
	}

}
