package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> x = new ArrayList<Integer>();
		
		x.add(10);
		
		for(Integer c : x) {
			System.out.println(c.compareTo(10));
		}
		
		sc.close();
	}
}
