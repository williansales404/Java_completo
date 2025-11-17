package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double valueTotal = sc.nextDouble();
		
		Contract contract = new Contract(number, date, valueTotal);
		
		System.out.println();
		System.out.println("Entre com o numero de parcelas:");
		System.out.print("Parcelas: ");
		int parcelNumber = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, parcelNumber);
		
		contract.listContratParcel();
		
		sc.close();
	}

}
