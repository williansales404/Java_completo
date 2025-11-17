package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int lin = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[lin][col];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int num = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					int positionSuperior = i - 1;
					int positionEsquerda = j - 1;
					int positionDireita = j + 1;
					int positionBaixo = i + 1;

					System.out.printf("position %d, %d %n", i, j);
					if (positionSuperior >= 0) {
						System.out.println("Superior " + mat[positionSuperior][j]);
					}
					if (positionEsquerda >= 0) {
						System.out.println("Esquerda " + mat[i][positionEsquerda]);
					}
					if (positionDireita < col) {
						System.out.println("Direita " + mat[i][positionDireita]);
					}
					if (positionBaixo < lin) {
						System.out.println("Baixo " + mat[positionBaixo][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}

}
