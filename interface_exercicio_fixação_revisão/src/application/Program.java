package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valuetotal = sc.nextDouble();
		
		Contract obj = new Contract(number, date, valuetotal);
		System.out.println();
		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(obj, months);
		
		System.out.println("Parcelas:");
		
		for(Installment installment: obj.getListInstallment()) {
			System.out.println(installment);
		}
		
		
		
		
		
		sc.close();
	}

}
