package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;
	private LocalDate BirthDate;
	
	private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Client(String name, String email, LocalDate birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.BirthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Client: "+name+" ("+BirthDate.format(formatDate)+") - "
						+email;
	}
}
