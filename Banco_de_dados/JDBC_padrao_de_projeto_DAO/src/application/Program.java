package application;


import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("====== Test 1: seller findById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n====== Test 2: seller findByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller c: list) {
			System.out.println(c);
		}
		
		System.out.println("\n====== Test 3: seller findAll ======");
		List<Seller> list3 = sellerDao.findAll();
		for(Seller c: list3) {
			System.out.println(c);
		}
		
		System.out.println("\n====== Test 4: seller Insert ======");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.parse("1995-01-01"), 1000.0, department);
		//sellerDao.insert(newSeller);
		System.out.println("Insert! New id = "+ newSeller.getId());
		
	}

}
