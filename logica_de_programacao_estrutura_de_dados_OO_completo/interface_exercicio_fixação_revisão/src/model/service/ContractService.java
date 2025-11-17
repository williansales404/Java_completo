package model.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService() {
	}
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		double valueParcel = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			
			LocalDate date = contract.getDate().plusMonths(i);
			
			double paymentInterest = valueParcel + onlinePaymentService.interest(valueParcel, i);
			double paymentFee = paymentInterest + onlinePaymentService.paymentFee(paymentInterest);
			
			contract.getListInstallment().add(new Installment(date, paymentFee));
		}

	}
}
