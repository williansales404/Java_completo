package entities;

public class LegalEntity extends Person{
	private Integer employeeQuantity;
	
	public LegalEntity() {
		super();
	}
	
	public LegalEntity(String name, Double annualIncome, Integer employeeQuantity) {
		super(name, annualIncome);
		this.employeeQuantity = employeeQuantity;
	}
	
	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}

	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}

	@Override
	public Double incomeTax() {
		if(employeeQuantity <= 10) {
			return getAnnualIncome() * 0.16;
		}
		else {
			return getAnnualIncome() * 0.14;
		}
	}
	
}
