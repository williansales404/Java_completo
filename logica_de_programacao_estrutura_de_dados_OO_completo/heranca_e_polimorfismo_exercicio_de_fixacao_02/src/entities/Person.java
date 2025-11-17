package entities;

public abstract class Person {
	private String name;
	private Double annualIncome;
	
	public Person() {
	}

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public abstract Double incomeTax();
}
//Herança total para subClasses, a classe Person não vai ser instanciada.
//Neste caso não faz sentido implementa logica no metodo nesta classe gerenerica