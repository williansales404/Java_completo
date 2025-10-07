package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 25/06/2018 10:30
		LocalDateTime d05 = LocalDateTime.parse("2018-06-25T10:30:00");
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		
		 //25/06/2018 14:40
		Duration t3 = Duration.between(d05, LocalDateTime.parse("2018-06-27T11:40:00"));
		
		
		System.out.println();

		sc.close();
	}
}
