package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		/*
		 * quando posso ler a lista mas não posso inserir add chama-se de covariância
		 */

		List<? extends Number> list = intList;
		// consigo acessar valores da lista
		Number x = list.get(0);
		// não consigo add valor a lista
		list.add(20); // erro de compilacao
		////////////////////////////////////////////////////////////////////////////////
		
		List<Object> myObjs = new ArrayList<Object>();
		 myObjs.add("Maria");
		 myObjs.add("Alex");
		 
		 /*quando não posso ler e posso inseri chama-se contravariância*/
		 List<? super Number> myNums = myObjs;
		 myNums.add(10);
		 myNums.add(3.14);
		 Number x = myNums.get(0); // erro de compilacao
	}
}
