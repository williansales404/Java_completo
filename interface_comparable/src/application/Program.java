package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employeer;

public class Program {

	public static void main(String[] args) {
		
		List<Employeer> listEmployeers = new ArrayList<>();

		String path = "C:\\workspace\\interface_comparable\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String emp = br.readLine();
			
			while(emp != null) {
				
				String [] employeer = emp.split(",");
				
				listEmployeers.add(new Employeer(employeer[0], Double.parseDouble(employeer[1])));
				
				emp = br.readLine();	
			}
			
			Collections.sort(listEmployeers);
			
			for(Employeer c: listEmployeers) {
				System.out.println(c.getName()+","+c.getSalary());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}