package application;

import java.time.Instant;

public class Program {

	public static void main(String[] args) {
		Instant d05 = Instant.parse("2018-08-26T20:45:08Z");
		
		System.out.println(d05.toString());
	}
}
