package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Black");
		
		Seller sl = new Seller(1, "Bob", "Bob@gamil.com", LocalDate.parse("01/01/2025", 
				DateTimeFormatter.ofPattern("dd/MM/yyyy") ), 1000.0);
		
		System.out.println(sl);
		System.out.println(dp);
		
	}

}
