package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Course> list = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		Set<Course> id_A = new HashSet<>();
		for (int i = 0; i < a; i++) {
			long value = sc.nextInt();
			id_A.add(new Course(value));
			list.addAll(id_A);
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		Set<Course> id_B = new HashSet<>();
		for (int i = 0; i < b; i++) {
			long value = sc.nextInt();
			id_B.add(new Course(value));
			list.addAll(id_B);
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		Set<Course> id_C = new HashSet<>();
		for (int i = 0; i < c; i++) {
			long value = sc.nextInt();
			id_C.add(new Course(value));
			list.addAll(id_C);
		}
		
		System.out.println("Total students: "+list.size());
		
		sc.close();
	}

}
