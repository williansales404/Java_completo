package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		//vetor de string para gravar no arquivo
		String [] text = new  String [] {"Boa noite", "Bom dia", "Boa tarde"};
		
		String pach ="C:\\workspace\\out.txt"; // caminho onde o arquivo vai ser criado e escrito e seu nome e formato txt
		
		//este bloco de recurso ele vai recriar o arquivo e gravar do zero
		//para rescrever o arquivo com counteudo existente declare no argumente de filewriter true
		//EX:FileWriter(pach, true)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pach))){
			
			for(String c: text) {
				bw.write(c);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
