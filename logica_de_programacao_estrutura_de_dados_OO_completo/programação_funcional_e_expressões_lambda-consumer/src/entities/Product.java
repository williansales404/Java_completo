package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// metodo consumer
	// Nome do metodo não obedece contrato não precisa do Override
	public void nonStaticUptadePrice() {
		price = price * 1.1;
	}

	// metodo consumer
	// Nome do metodo não obedece contrato não precisa do Override
	public static void staticUptadePrice(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}
}