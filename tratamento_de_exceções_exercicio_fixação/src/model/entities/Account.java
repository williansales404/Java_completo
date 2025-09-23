package model.entities;

import model.exception.DomainException;

public class Account {
	private Integer number; // numero conta
	private String holder; // titular conta
	private Double balance; // saldo conta
	private Double withdrawLimit; // limite de saque

	Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {

		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withdraw(Double amount) {
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}

		if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance");
		}

		balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + getBalance();
	}
}
