package model.service;

import java.time.format.DateTimeFormatter;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//Criei o construtor para fazer o upcasting
	OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {

		//int parcelNumber = months;
		double valueParcelFixe = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double valueParcelTax = onlinePaymentService.paymentFee(valueParcelFixe);
			double valueParcelMonths = onlinePaymentService.interest(valueParcelTax, i);
			contract.setInstallment(new Installment(contract.getDate().plusMonths(i), valueParcelMonths));
			
			System.out.println(contract.getInstallment().getDueDate().format(fmt)+" - "+String.format("%.2f",contract.getInstallment().getAmount()));
		}
	}
}
