package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Customer;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entercliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birthdate (DD/MM/YYYY):");
		String birthDate = sc.next();
		System.out.println("Enter order data:");
		String status = sc.next();
		
		Order order = new Order(OrderStatus.valueOf(status), new Customer(name,email,LocalDate.parse(birthDate, formatt)));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i< n; i++) {
			System.out.printf("Enter#%d item data:%n",i+1);
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(new Product(nameProduct, priceProduct), quantity);
			order.addItens(orderItem);
			
		}
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
