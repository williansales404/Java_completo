package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*este arquivo não existe justamente para da erro e entender o bloco finally
		 *mas pode criar o arquivo e passar o caminho para new file
		 *se a tentativa da leiura der certo ou não o bloco finally vai ser executado*/
		File file = new File("C:\\Users\\willian sales\\Downloads\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erroropeningfile: " + e.getMessage());
		} finally {
			// este bloco executa idependente do bloco try dar certo ou não.
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}
