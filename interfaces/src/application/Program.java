package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrasilTaxService;
import model.service.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), formatt);
		System.out.print("Retorno ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), formatt);
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(modelo));
		
		System.out.print("Entre com o preço por hora ");
		double valuePerhoura = sc.nextDouble();
		System.out.print("Entre com o preço por dia ");
		double valuePerday = sc.nextDouble();
		
		RentalService rentalService = new RentalService(valuePerhoura, valuePerday, new BrasilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURE:");
		System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: "+carRental.getInvoice().getTotalPayment());
		
		
		sc.close();
	}

}
