package entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuerPerHour;
	private Integer hours;

	HourContract() {
	}

	public HourContract(LocalDate date, Double valuerPerHour, Integer hours) {
		this.date = date;
		this.valuerPerHour = valuerPerHour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuerPerHour() {
		return valuerPerHour;
	}

	public void setValuerPerHour(Double valuerPerHour) {
		this.valuerPerHour = valuerPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return valuerPerHour * hours;
	}

}
