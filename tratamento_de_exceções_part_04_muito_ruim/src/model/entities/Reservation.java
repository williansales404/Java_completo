package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;

	public static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation() {
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public Long duration() {
		Duration tp = Duration.between(getCheckin().atStartOfDay(), getCheckout().atStartOfDay());
		return tp.toDays();
	}

	public void updateDate(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(getRoomNumber());
		sb.append(", check-in: ");
		sb.append(getCheckin().format(df));
		sb.append(", check-out: ");
		sb.append(getCheckout().format(df));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights");

		return sb.toString();
	}

}
