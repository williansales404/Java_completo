package entities;

public class SistemaBancario {
	
	private String name;
	private int account;
	private double deposit;
	
	public SistemaBancario() {
		
	}
	
	public SistemaBancario( int account, String name, double initialDeposit) {
		this.name = name;
		this.account = account;
		depositAccount(initialDeposit);
		
	}
	
	public SistemaBancario( int account, String name) {
		this.name = name;
		this.account = account;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccount() {
		return account;
	}
	
	public static final double rate = 5.0;
	
	public double getDeposit() {
		return deposit;
	}
	
	public void depositAccount(double deposit) {
		if(deposit > 0.0) {
			this.deposit = this.deposit + deposit;
		}
	}
	
	public void sakeAccount(double sake) {
		if(sake > 0.0) {
			this.deposit = this.deposit - (sake + rate);
		}
	}
	
	public String toString() {
		return  String.format("Account %d, ",getAccount())
				+ String.format("Holder: %s, ",getName())
				+String.format("Balance: $ %.2f",getDeposit());
	}
	
}
