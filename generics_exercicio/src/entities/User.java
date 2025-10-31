package entities;

import java.time.Instant;
import java.util.Objects;

public class User implements Comparable<User>{
	private String name;
	private Instant instant;
	
	public User() {
	}
	
	public User(String name, Instant instant) {
		this.name = name;
		this.instant = instant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(instant, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(instant, other.instant) && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(User others) {
		return name.toUpperCase().compareTo(others.getName().toUpperCase());
	}
	
}
