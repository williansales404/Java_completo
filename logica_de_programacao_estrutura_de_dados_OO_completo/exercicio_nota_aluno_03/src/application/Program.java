package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Nota;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota aluno = new Nota();
		
		aluno.Name = sc.nextLine();
		aluno.a = sc.nextDouble();
		aluno.b = sc.nextDouble();
		aluno.c = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.sumGrade());
		System.out.println(aluno.status());
		
		if(aluno.status() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS", aluno.points());
		}
		
		sc.close();
	}

}
