package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import service.Service;

public class Program {
	public static void main(String[] args) {
		
		 List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		 List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		 List<Object> myObjs = new ArrayList<Object>();
		 
		 Service.copy(myInts, myObjs);
		 Service.print(myObjs);
		 System.out.println();
		 Service.copy(myDoubles, myObjs);
		 Service.print(myObjs);
		 
		/* Get, Put

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		//Covariância: posso ler a lista mas não posso inserir valores a ela

		List<? extends Number> list = intList;
		// consigo acessar valores da lista
		Number x = list.get(0);
		// não consigo add valor a lista
		list.add(20); // erro de compilacao
		////////////////////////////////////////////////////////////////////////////////
		
		List<Object> myObjs = new ArrayList<Object>();
		 myObjs.add("Maria");
		 myObjs.add("Alex");
		 
		 //Contravariância: não posso ler mas posso inseri valores a ela
		 List<? super Number> myNums = myObjs;
		 myNums.add(10);
		 myNums.add(3.14);
		 Number x = myNums.get(0); // erro de compilacao*/

	}
}
