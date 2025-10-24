package model.service;

public class BrasilInterestService implements InterestService {
	private Double interestRate;

	public BrasilInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	/*
	 * Este metodo não pode ser copiado para a interface o ele depende da variavel
	 * do objeto e a interface não armazena estado valores
	 */
	@Override
	public Double getInterestRate() {
		return interestRate;
	}
}
