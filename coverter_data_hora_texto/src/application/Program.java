package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//DATA HORA COM FORMATO TEXTO CUSTOMIZADO
		
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2025-08-07");
		LocalDateTime d05 = LocalDateTime.parse("2025-08-07T01:30:26");
		Instant d06 = Instant.parse("2025-08-07T01:30:26Z");
		//não da para formatar instant sem pasar fuso harario
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//fmt3 esta considerando o fuso horario local da maquina usada
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 + fmt1 = " + d04.format(fmt1));
		//System.out.println("d04 + fmt1 = " + fmt1.format(d04));
		//System.out.println("d04 + fmt1 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		System.out.println("d05 + fmt1 = " + d05.format(fmt1));
		System.out.println("d05 + fmt2 = " + d05.format(fmt2));
		System.out.println("d05 + fmt4 = " + d05.format(fmt4));
		
		System.out.println();
		System.out.println("d06 + fmt3 = " + fmt3.format(d06));// apresenta 3 horas antes do GMT do meu horario atual da maquina ou que foi passado como argumento para d06
		System.out.println("d06 + fmt5 = " + fmt5.format(d06));
		System.out.println();
		
		
		
	}

}
