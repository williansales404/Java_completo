package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();

		System.out.print("How many students for course A?");
		int A = sc.nextInt();
		for (int i = 0; i < A; i++) {
			int id = sc.nextInt();
			a.add(id);
		}

		System.out.print("How many students for course B?");
		int B = sc.nextInt();
		for (int i = 0; i < B; i++) {
			int id = sc.nextInt();
			b.add(id);
		}

		System.out.print("How many students for course C?");
		int C = sc.nextInt();
		for (int i = 0; i < C; i++) {
			int id = sc.nextInt();
			c.add(id);
		}
		
		Set<Integer> list = new HashSet<Integer>(a);
		list.addAll(c);
		list.addAll(b);
		
		System.out.println("Total students: "+list.size());
		sc.close();
	}

}
