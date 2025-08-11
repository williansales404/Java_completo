package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2025-08-07");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-07T01:30:26");
		Instant d06 = Instant.parse("2025-08-07T01:30:26Z");

		/*
		 * for(String s : ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 */

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 + d06 = " + r1);
		System.out.println("r2 + d06 = " + r2);
		System.out.println();
		System.out.println("r1 + d06 + horas= " + r3);
		System.out.println("r2 + d06 + horas= " + r4);
		System.out.println();
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println();
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());
		System.out.println("d05 segundos = " + d05.getSecond());
	}

}
