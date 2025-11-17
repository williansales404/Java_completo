package model.service;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterestRate();

	/*
	 * Agora a interface prover reuso, e herança multipla no caso o java permite
	 * implementar mais de uma interface em uma classe, pois a classe que implementa
	 * a interface herda os seus comportamentos
	 */
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
