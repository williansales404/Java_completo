package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;

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

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product Other) {
		return name.toUpperCase().compareTo(Other.getName().toUpperCase());
		
		/*
		 * toUpperCase() converte a string para letras maiuscula
		 * Esta é uma maneira de garantir que você nunca terá problemas com a comparação
		 * por exemplo de uma palavra: "ANa" e "Ana" pois ambas serão convertidas para
		 * "ANA", e a comparação ficará correta.
		 */
	}
}
