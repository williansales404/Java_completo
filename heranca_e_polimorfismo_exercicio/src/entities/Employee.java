package entities;

public class Employee {
	private String name;
	private Integer hous;
	private Double valuePerHour;
	
	Employee(){
	}

	public Employee(String name, Integer hous, Double valuePerHour) {
		this.name = name;
		this.hous = hous;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHous() {
		return hous;
	}

	public void setHous(Integer hous) {
		this.hous = hous;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hous * valuePerHour; 
	}
}
