package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44",format);
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post(moment, title, content, likes);
		post1.addComment(c1);
		post1.addComment(c2);
		System.out.println(post1.toString());
		
		System.out.println();
		
		Post post2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", format),
						"Good night guys",
						"See you tomorrow",
						5);
		
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		System.out.println(post2);
		
	}

}
