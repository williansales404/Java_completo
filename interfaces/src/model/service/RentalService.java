package model.service;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;

	BrasilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrasilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		
		double basicPayment;
		
		double minutos = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hora = minutos / 60.0;
		
		if(hora <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hora);
		}
		else{
			basicPayment = pricePerDay * Math.ceil(hora/24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
}
