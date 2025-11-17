package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Caminho do arquivo");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		System.out.println("METODOS DO FILE");
		System.out.println(path.getName());
		System.out.println(path.getParent());
		System.out.println(path.getPath());
		System.out.println();
		sc.close();
	}

}
