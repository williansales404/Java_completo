package entities;

public class BusinessAccount extends Account{
	//Esta classe e uma extenção de account
	//chamamos de subclasse
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			loanLimit -= amount;
			balance += amount - 100;
		}
		
	}
	
}
