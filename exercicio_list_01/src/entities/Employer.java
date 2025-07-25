package entities;

import java.util.Objects;

public class Employer {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employer() {
	}
	
	public Employer(Integer id) {
		this.id = id;
	}
	
	public Employer(Double salary) {
		this.salary = salary;
	}
	
	public Employer(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double salary, double percent) {
		this.salary = salary + ( percent/100 * salary);
	}

	@Override
	public String toString() {
		return String.format("Employer id= %d name= %s salary= %.2f ",id,name,salary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employer other = (Employer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
	
	
	
	
}
