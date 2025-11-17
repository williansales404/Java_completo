package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatando uma data personalizada 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-08-05");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-04T00:30:29");
		Instant d06 = Instant.parse("2025-08-05T23:30:26Z");
		Instant d07 = Instant.parse("2025-08-05T23:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("07/08/2025", fmt1);//pasando o fmt1 como agumento para acita a data formatada
		LocalDateTime d09 = LocalDateTime.parse("07/08/2025 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2025, 8, 7);
		LocalDateTime d11 = LocalDateTime.of(2025, 8, 7, 01, 30);
		
		System.out.println("d01 = "+d01.toString());
		System.out.println("d02 = "+d02.toString());
		System.out.println("d03 = "+d03.toString());
		System.out.println("d04 = "+d04.toString());
		System.out.println("d05 = "+d05.toString());
		System.out.println("d06 = "+d06.toString());
		System.out.println("d07 = "+d07.toString()); // adianto a hora em relação a londrez hora padrão e a data atianto com o horario atiantando para o dia seguinte
		System.out.println("d08 = "+d08.toString());
		System.out.println("d09 = "+d09.toString());
		System.out.println("d10 = "+d10.toString());
		System.out.println("d11 = "+d11.toString());
		
	}

}
