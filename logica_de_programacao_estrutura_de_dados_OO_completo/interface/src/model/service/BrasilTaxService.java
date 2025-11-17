package model.service;

public class BrasilTaxService implements TaxService{
	
	public Double tax(Double Amount) {
		if(Amount <= 100.0) {
			return Amount * 0.20;
		}
		else {
			return Amount * 0.15;
		}
	}
}
