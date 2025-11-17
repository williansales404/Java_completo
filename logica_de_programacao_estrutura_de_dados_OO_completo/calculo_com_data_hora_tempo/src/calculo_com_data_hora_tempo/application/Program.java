package calculo_com_data_hora_tempo.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekLocalInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekLocalInstant);
		
		System.out.println("pastWeekLocalDate + d04= " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate + d04 = " + nextWeekLocalDate);
		System.out.println();
		System.out.println("pastWeekLocalDateTime + d05= " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime + d05 = " + nextWeekLocalDateTime);
		System.out.println();
		System.out.println("pastWeekLocalInstant + d06= " + pastWeekLocalInstant);
		System.out.println("pastWeekLocalInstant + d06= " + nextWeekLocalInstant);
		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
		
		
	}

}
