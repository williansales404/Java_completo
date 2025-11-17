package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main_Set {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		//HashSet rapito mas não mantem a ordem
		System.out.println("HashSet");
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		//set.removeIf(x -> x.length() > 3);
		System.out.println(set1.contains("Tv"));
		for(String p: set1) {
			System.out.println(p);
		}
		
		System.out.println();
		Set<String> set2 = new TreeSet<String>();
		System.out.println("TreeSet");
		// ordenado pelo compareTo do objeto (ou Comparator)]
		//Aqui ele ordeno por String
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");
		System.out.println(set2.contains("Tv"));
		for(String p: set2) {
			System.out.println(p);
		}
		
		System.out.println();
		Set<String> set3 = new LinkedHashSet<String>();
		System.out.println("LinkedHashSet");
		//Mantem a orden em que os objetos são inseridos
		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");
		System.out.println(set3.contains("Tv"));
		//set.removeIf(x -> x.length() > 3);
		set3.remove("Tablet");
		for(String p: set3) {
			System.out.println(p);
		}
		
	}

}
