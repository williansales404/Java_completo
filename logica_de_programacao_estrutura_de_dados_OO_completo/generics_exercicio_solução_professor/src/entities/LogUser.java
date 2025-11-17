package entities;

import java.time.Instant;
import java.util.Objects;

public class LogUser {
	private String nameUser;
	private Instant instantLog;
	
	LogUser(){
	}

	public LogUser(String nameUser, Instant instantLog) {
		this.nameUser = nameUser;
		this.instantLog = instantLog;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public Instant getInstantLog() {
		return instantLog;
	}

	public void setInstantLog(Instant instantLog) {
		this.instantLog = instantLog;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameUser);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUser other = (LogUser) obj;
		return Objects.equals(nameUser, other.nameUser);
	}
}
