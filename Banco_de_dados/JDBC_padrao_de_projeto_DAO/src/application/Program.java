package application;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department dp = new Department(1, "Books");
		
		Seller sl = new Seller(1, "bob", "bob@gmail.com", 
				LocalDate.parse("01/02/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 1000.0, dp);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sl);
		System.out.println(dp);
		
	}

}
