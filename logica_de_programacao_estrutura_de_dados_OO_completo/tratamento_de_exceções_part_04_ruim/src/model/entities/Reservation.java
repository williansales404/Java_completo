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

	public String updateDate(LocalDate checkin, LocalDate checkout) {

		LocalDate dateNow = LocalDate.now();

		if (checkin.isBefore(dateNow) || checkout.isBefore(dateNow)) {
			return "Error in reservation: Reservation dates for update must be future dates";
		}
		if (!checkout.isAfter(checkin)) {
			return "Error in reservation: Check-out date must be after check-in date";
		}

		this.checkin = checkin;
		this.checkout = checkout;

		return null;
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
