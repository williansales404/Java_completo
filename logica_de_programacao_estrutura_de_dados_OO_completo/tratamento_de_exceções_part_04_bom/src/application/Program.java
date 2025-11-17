package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exeptions.DomainExeption;

//https://docs.oracle.com/javase/specs/jls/se8/html/jls-11.html
//https://www.datacamp.com/pt/doc/java/java-operators
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String checkIn = sc.next();
		LocalDate checkin = LocalDate.parse(checkIn, df);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String checkOut = sc.next();
		LocalDate checkout = LocalDate.parse(checkOut, df);

		Reservation reservation = new Reservation(roomNumber, checkin, checkout);
		System.out.println(reservation);

		System.out.println();
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = sc.next();
		checkin = LocalDate.parse(checkIn, df);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = sc.next();
		checkout = LocalDate.parse(checkOut, df);

		reservation.updateDate(checkin, checkout);
		System.out.println("Reservation: " + reservation);
		}
		//Exception expecifica primeiro depois generica
		catch (DomainExeption e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			System.out.println("erro usando superClass exception ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		sc.close();
		/*Nos exercio mostramos o printStackTrace() mas em um projeto real
		 *e usado e enviado para um arquivo log e para o usuario mostra uma mensagem de erro amigavel
		 *
		 *-------------------------------------------------------------------------------------------
		 *Exception não verificada: são aquelas exception que so pode ser visto apos a execução do program
		 *usando RumtimeException essa exception ocorre em tempo de execução esse tipo de exception não tem como prever,
		 *oque pode ser feite e executar o programa e tenta capturar a exeção que aparecer e tratar.
		 *-------------------------------------------------------------------------------------------
		 *
		 *Exception verificada: as mais conhecidas são, IOException e SQLException.
		 **/
	}
}
