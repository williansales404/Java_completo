package model.entities;

public class Product {
	private String name;
	private Double value;
	private Integer quantity;

	public Product() {
	}
	
	public Product(String name, Double value, Integer quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double totalValue() {
		return value * quantity;
	}
}
