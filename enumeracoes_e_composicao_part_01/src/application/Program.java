package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		//Enumeraçao
		//https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
		
		Order orde = new Order(10, new Date(), OrderStatus.PENDING_PAYMENT);
		//enum e convertido para String por padrão
		System.out.println(orde);
		System.out.println();
		//converter String para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		
		String x = "DELIVERED";
		OrderStatus os2 = OrderStatus.valueOf(x);
		System.out.println(os2);
		
	}

}
