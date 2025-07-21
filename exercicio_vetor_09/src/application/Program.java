package application;

import java.util.Scanner;


import entities.Entrada;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Entrada p = new Entrada();
		
		p.entrada();
		
		sc.close();
	}

}
