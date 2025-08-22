package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		//(LocalDateTime.parse("21/06/2018 13:05:44",formatter)
		Post post1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",formatter),
						"Traveling to New Zealand",
						"I'm going to visit this wonderful country!",
						12);
		
		post1.commentAdd(new Comment("Have a nice trip"));
		post1.commentAdd(new Comment("Wow that's awesome!"));
		
		System.out.println(post1.toString());
	}

}
