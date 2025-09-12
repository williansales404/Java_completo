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
		/*double basicTax;
		if(getAnnualIncome() < 20000.0) {
			basicTax = getAnnualIncome() * 0.15;
		}
		else {
			basicTax = getAnnualIncome() * 0.25;
		}*/
		
		double basicTax = (getAnnualIncome() < 20000.0) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
		
		basicTax -= getHealth() * 0.5;
		//esse if e para evitar erro caso o imposto sobre health gasto com saude, seja maior que o imposto sobre annualIncome renda anual.
		//se caso o resultata for negativo evita erro
		if(basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
