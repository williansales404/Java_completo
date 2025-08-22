package entities;

import java.time.LocalDate;

public class Sistema {
	LocalDate date;
	Double valuePerhour;
	Integer hours;
	
	
	
	public Sistema(LocalDate date, Double valuePerhour, Integer hours) {
		this.date = date;
		this.valuePerhour = valuePerhour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Double getValuePerhour() {
		return valuePerhour;
	}



	public void setValuePerhour(Double valuePerhour) {
		this.valuePerhour = valuePerhour;
	}



	public Integer getHours() {
		return hours;
	}



	public void setHours(Integer hours) {
		this.hours = hours;
	}



	public double totalValue() {
		return valuePerhour * hours;
	}

	@Override
	public String toString() {
		return "Sistema [date=" + date + ", valuePerhour=" + valuePerhour + ", hours=" + hours + "]";
	}
	
	
	
}