package model.entities;

public class Employeer implements Comparable<Employeer>{
	private String name;
	private Double salary;

	public Employeer() {
	}

	public Employeer(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employeer other) {
		return name.compareTo(other.getName());
	}

}
