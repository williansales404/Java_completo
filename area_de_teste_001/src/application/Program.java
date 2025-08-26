package application;

import java.util.Locale;

import entities.Sistema;
import entities.SistemaTT;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Sistema orderProduct = new Sistema(new SistemaTT("TV", 12.0), 2);
		
//		System.out.println(orderProduct.getSistematt().getName());
//		System.out.println(orderProduct.getSistematt().getPrice());
//		System.out.println(orderProduct.getQuantity());
		
		System.out.println(orderProduct.getSistematt().getPrice());
		
	}
}
