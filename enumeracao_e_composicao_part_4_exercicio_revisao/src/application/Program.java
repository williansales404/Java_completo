package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birthdate (DD/MM/YYYY): ");
		String birthDate = sc.next();

		Client client = new Client(name, email, LocalDate.parse(birthDate, formatDate));

		System.out.println("Enter order data:");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(LocalDateTime.now(), status, client);

		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data:%n", i + 1);
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();

			order.addItem(new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct)));
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}
}
