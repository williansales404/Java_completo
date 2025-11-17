package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

//https://www.datacamp.com/pt/doc/java/java-operators
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String checkIn = sc.next();
		LocalDate checkin = LocalDate.parse(checkIn, df);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String checkOut = sc.next();
		LocalDate checkout = LocalDate.parse(checkOut, df);

		if (!checkout.isAfter(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Room number: ");
			roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sc.next();
			checkin = LocalDate.parse(checkIn, df);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sc.next();
			checkout = LocalDate.parse(checkOut, df);
			
			LocalDate dateNow = LocalDate.now();
			
			if(checkin.isBefore(dateNow) || checkout.isBefore(dateNow)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if(!checkout.isAfter(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDate(checkin, checkout);
				System.out.println(reservation);
			}
		}
		sc.close();
	}
}
