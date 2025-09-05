package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hous, Double valuePerHour, Double additionalCharge) {
		super(name, hous, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
