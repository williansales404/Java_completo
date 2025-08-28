package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private static DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	Order(){
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for(OrderItem c: items) {
			sum += c.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Ordermoment: ");
		sb.append(moment.format(formatDate));
		sb.append("\nOrderstatus: ");
		sb.append(status+"\n");
		sb.append(client);
		sb.append("\nOrderitems: \n");
		for(OrderItem c: items) {
			sb.append(c+"\n");
		}
		sb.append("Total price: $");
		sb.append(total());
		
		return sb.toString();
	}
	
}
