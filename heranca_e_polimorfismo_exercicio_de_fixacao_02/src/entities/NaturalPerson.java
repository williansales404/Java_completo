package entities;

public class NaturalPerson extends Person {
	private Double health;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double health) {
		super(name, annualIncome);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	
	@Override
	public Double incomeTax() {
		if(getAnnualIncome() <= 20000.0) {
			return (getAnnualIncome() * 0.15) - (getHealth() * 0.5); 
		}
		else {
			return (getAnnualIncome() * 0.25) - (getHealth() * 0.5);
		}
	}

}
