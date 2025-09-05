package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	//private static DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f", getName(),getPrice())
				+" (Manufacturedate: "
				+manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")";
		//manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
		//" (Manufacturedate: "+manufactureDate.format(formatt)+")"
	}
}
