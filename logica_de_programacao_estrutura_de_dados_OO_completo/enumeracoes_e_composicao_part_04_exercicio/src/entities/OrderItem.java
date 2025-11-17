package entities;

public class OrderItem {
	private Product product = new Product();
	private Integer quantity;
	
	public OrderItem() {
	}
	
	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double subTotal() {
		return quantity * product.getPrice();
	}
	
}
