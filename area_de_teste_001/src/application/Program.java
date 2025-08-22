package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String x = "01/";
		
		String enterDate = x+"10/2025";
		LocalDate date = LocalDate.parse(enterDate, format);
		System.out.println(date.getMonthValue());
		
		
	}
}
