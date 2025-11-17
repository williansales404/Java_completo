package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static DateTimeFormatter formatBirthDate = DateTimeFormatter.ofPattern("dd/MM/yyy");
	
	private LocalDateTime moment = LocalDateTime.now();
	private OrderStatus status;
	
	private List<OrderItem> itens = new ArrayList<OrderItem>();
	private Customer customer = new Customer();
	
	Order(){
	}

	public Order(OrderStatus status, Customer customer) {
		this.status = status;
		this.customer = customer;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
	public void addItens(OrderItem item) {
		itens.add(item);
	}
	
	public void addRemove(OrderItem item) {
		itens.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem c: itens) {
			sum += c.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Ordermoment: "+ moment.format(formatt)+"\n");
		sb.append("Orderstatus: "+status+"\n");
		sb.append("Client: "+customer.getName()
							+" ("+customer.getBirthDate().format(formatBirthDate)+") - "
							+customer.getEmail()+"\n");
		sb.append("Orderitems:\n");
		for(OrderItem c: itens) {
			sb.append(c.getProduct().getName()+
					", $"+c.getProduct().getPrice()+", "
					+"Quantity: "+c.getQuantity()+", "
					+"Subtotal: " + c.subTotal()+"\n");
		}
		sb.append("Total price: "+total());
		
		return sb.toString();
	}
	
}
