package entities;

import java.util.Locale;
import java.util.Scanner;

public class EnterGrade {
	
	public void EnterGradeStudent() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		SchoolGrade[] vet = new SchoolGrade[n];

		int cont = 1;
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n",cont++);
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			double media = (grade1 + grade2)/2;
			sc.nextLine();
			
			vet[i] = new SchoolGrade(name, grade1, grade2, media);
		}
		
		double approvede = 6.0;
		for (int i = 0; i < vet.length; i++) {
			if(vet[i].getAverage() >= approvede) {
				System.out.println(vet[i].getName());
			}
		}
		sc.close();
	}
}
