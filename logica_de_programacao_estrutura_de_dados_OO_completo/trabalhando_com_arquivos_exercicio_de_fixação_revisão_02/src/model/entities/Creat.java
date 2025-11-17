package model.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creat {
	public void creatProductCsv(Product p, String caminhoArquivo) {
		boolean existingFile = new File(caminhoArquivo).exists();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, existingFile))) {
			
			if(existingFile != true) {
				bw.write("NOME;VALOR;QUANTIDADE");
				bw.newLine();
			}
			
			bw.write(p.getName() + ";" + p.getValue() + ";" + p.getQuantity());
			
			bw.newLine();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
